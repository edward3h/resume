package local;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

public abstract class ConcatFilesTask extends DefaultTask {
    @OutputFile
    public abstract RegularFileProperty getTarget();

    @InputFiles
    public abstract ConfigurableFileCollection getSources();

    @TaskAction
    public void concatFiles() {
        var output = getTarget().get().getAsFile().toPath();
        try (var writer = Files.newBufferedWriter(output)) {
            for (var source: getSources()) {
                try (var reader = Files.newBufferedReader(source.toPath())) {
                    reader.transferTo(writer);
                }
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}