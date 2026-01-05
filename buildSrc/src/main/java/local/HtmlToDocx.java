package local;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.internal.file.FileOperations;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.process.ExecOperations;
import org.gradle.process.ExecSpec;

import javax.inject.Inject;
import java.io.File;

public abstract class HtmlToDocx extends DefaultTask {
    private final ExecOperations execOperations;
    private final FileOperations fileOperations;

    @InputFile
    public abstract RegularFileProperty getSource();

    @OutputFile
    public abstract RegularFileProperty getTarget();

    private final File projectDirectory;

    @Inject
    public HtmlToDocx(ExecOperations execOperations, FileOperations fileOperations) {
        this.execOperations = execOperations;
        this.fileOperations = fileOperations;
        this.projectDirectory = getProject().getLayout().getProjectDirectory().getAsFile();
    }

    @TaskAction
    public void run() {
        execOperations.exec(this::runWithSpec);
    }

    private void runWithSpec(ExecSpec spec) {
        spec.commandLine(
                "docker", "run", "--rm", "--user", "1000:1000",
                "--volume", projectDirectory.getAbsolutePath() + ":/data", "pandoc/core:latest",
                "--shift-heading-level-by=-1",
                "-o", fileOperations.relativePath(getTarget()),
                fileOperations.relativePath(getSource())
        );
    }
}
