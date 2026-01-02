import local.ConcatFilesTask
import local.MarkdownTask
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

plugins {
    base
}

var markdown = tasks.register<MarkdownTask>("markdown") {
	from = file("src/markdown")
}

var datestamp = tasks.register("datestamp") {
    outputs.file(layout.buildDirectory.file("datestamp.html"))
    doLast {
        var date = LocalDate.now()
        var formatted = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(date)
        outputs.files.singleFile.writeText("""
            <hr>
            <p><em>Last updated <time>$formatted</time></em</p>
        """.trimIndent())
    }
}

var concatFiles = tasks.register<ConcatFilesTask>("concat") {
    dependsOn(datestamp)
    target = layout.buildDirectory.file("pages/index.html")
    outputs.file(target)
    sources.from("src/html/header.html",
        markdown.get().into.file("resume.html"),
        if (project.hasProperty("includeContact")) markdown.get().into.file("contact.html") else null,
        datestamp.get().outputs.files.singleFile,
        "src/html/footer.html")
}

var docx = tasks.register<Exec>("docx") {
    inputs.file(concatFiles.get().target)
    outputs.file(layout.buildDirectory.file("docs/Edward_Harman_Resume.docx"))
    commandLine = listOf("docker", "run", "--rm",
        "--volume", layout.projectDirectory.asFile.absolutePath + ":/data", "pandoc/core:latest",
        "--shift-heading-level-by=-1",
        "-o", outputs.files.singleFile.relativeTo(layout.projectDirectory.asFile).toString(),
        inputs.files.singleFile.relativeTo(layout.projectDirectory.asFile).toString())
}