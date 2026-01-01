plugins {
    id("java")
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.vladsch.flexmark:flexmark-all:0.64.8")
}