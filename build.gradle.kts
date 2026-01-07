import local.PandocConvert
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

plugins {
    base
}

val formattedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(LocalDate.now())

var html = tasks.register<PandocConvert>("html") {
    source = file("src/markdown/resume2.md")
    target = layout.buildDirectory.file("pages/index.html")
    argFiles.add(PandocConvert.ArgFile("lua-filter", file("src/templates/panda.lua")))
    environment.put("FORMATTED_DATE", formattedDate)
}

tasks.register("pages") {
    dependsOn(html)
}

var docx = tasks.register<PandocConvert>("docx") {
    source = file("src/markdown/resume2.md")
    target = layout.buildDirectory.file("docs/Edward_Harman_Resume.docx")
    argFiles.add(PandocConvert.ArgFile("reference-doc", file("src/templates/word-styles2.docx")))
    argFiles.add(PandocConvert.ArgFile("lua-filter", file("src/templates/panda.lua")))
    environment.put("FORMATTED_DATE", formattedDate)
}