import local.HtmlToPdf
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
    argFiles.add(PandocConvert.ArgFile("lua-filter", file("src/templates/list-table.lua")))    
    argFiles.add(PandocConvert.ArgFile("lua-filter", file("src/templates/piped-list.lua")))
    environment.put("FORMATTED_DATE", formattedDate)
}

tasks.register("pages") {
    dependsOn(html)
}

var docx = tasks.register<PandocConvert>("docx") {
    source = file("src/markdown/resume2.md")
    target = layout.buildDirectory.file("pages/Edward_Harman_Resume.docx")
    argFiles.add(PandocConvert.ArgFile("reference-doc", file("src/templates/word-styles2.docx")))
    argFiles.add(PandocConvert.ArgFile("lua-filter", file("src/templates/panda.lua")))
    argFiles.add(PandocConvert.ArgFile("lua-filter", file("src/templates/list-table.lua")))
    argFiles.add(PandocConvert.ArgFile("lua-filter", file("src/templates/piped-list.lua")))
    environment.put("FORMATTED_DATE", formattedDate)
}

var testPipedList = tasks.register<PandocConvert>("testPipedList") {
    source = file("src/markdown/piped-list-test.md")
    target = layout.buildDirectory.file("test/piped.docx")
    argFiles.add(PandocConvert.ArgFile("lua-filter", file("src/templates/piped-list.lua")))
}

var pdf = tasks.register<HtmlToPdf>("pdf") {
    source = html.get().target
    target = layout.buildDirectory.file("pages/Edward_Harman_Resume.pdf")
}

tasks.named("build") {
    dependsOn(html, docx, pdf)
}