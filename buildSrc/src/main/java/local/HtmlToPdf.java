package local;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class HtmlToPdf extends DefaultTask {
    @InputFile
    public abstract RegularFileProperty getSource();

    @OutputFile
    public abstract RegularFileProperty getTarget();

    // based on https://www.baeldung.com/java-html-to-pdf
    @TaskAction
    public void run() throws IOException {
        var doc = Jsoup.parse(getSource().getAsFile().get(), "UTF-8");
        File outputFile = getTarget().getAsFile().get();
        try (var out = new FileOutputStream(outputFile)) {
            new PdfRendererBuilder()
                    .withFile(outputFile)
                    .toStream(out)
                    .withW3cDocument(new W3CDom().fromJsoup(doc), "/")
                    .run();
        }
    }

}
