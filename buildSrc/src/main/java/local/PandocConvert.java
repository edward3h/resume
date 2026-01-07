package local;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.internal.file.FileOperations;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.MapProperty;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.process.ExecOperations;
import org.gradle.process.ExecSpec;

import javax.inject.Inject;
import java.io.File;
import java.io.Serializable;

public abstract class PandocConvert extends DefaultTask {
    private final ExecOperations execOperations;
    private final FileOperations fileOperations;

    @InputFile
    public abstract RegularFileProperty getSource();

    @OutputFile
    public abstract RegularFileProperty getTarget();

    public record ArgFile(String arg, File file) implements Serializable {}

    @Input
    public abstract ListProperty<ArgFile> getArgFiles();

    @Input
    public abstract MapProperty<String, String> getEnvironment();

    private final File projectDirectory;

    @Inject
    public PandocConvert(ExecOperations execOperations, FileOperations fileOperations) {
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
                "--volume", projectDirectory.getAbsolutePath() + ":/data"
                );
        getEnvironment().get().forEach((key,value) -> spec.args("--env", "%s=%s".formatted(key, value)));
        spec.args("pandoc/core:latest",
                "-s",
                "-o", fileOperations.relativePath(getTarget()),
                fileOperations.relativePath(getSource())
        );
        getArgFiles().get().forEach(argFile -> {
            spec.args("--" + argFile.arg, fileOperations.relativePath(argFile.file));
        });
    }
}
