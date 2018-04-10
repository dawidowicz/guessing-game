import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.jvm.tasks.Jar

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.20"

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", kotlin_version))
    }
}

group = "koty"
version = "1.0-SNAPSHOT"

plugins {
    idea
    application
    kotlin("jvm") version "1.2.20"
}

application {
    mainClassName = "koty.MainKt"
}

val kotlin_version: String by extra

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8", kotlin_version))

    testCompile("org.junit.platform:junit-platform-console:1.0.3")
    testCompile("org.jetbrains.spek:spek-api:1.1.5") {
        exclude("org.jetbrains.kotlin")
    }
    testCompile("org.jetbrains.spek:spek-data-driven-extension:1.1.5")
    testCompile("io.kotlintest:kotlintest:2.0.7")
    testCompile("org.mockito:mockito-core:2.13.0")
    testCompile("com.nhaarman:mockito-kotlin:1.5.0")

    testCompile("org.jetbrains.spek:spek-junit-platform-engine:1.1.5") {
        exclude("org.junit.platform")
        exclude("org.jetbrains.kotlin")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val fatJar = task("fatJar", type = Jar::class) {
    baseName = project.name
    manifest {
        attributes["Implementation-Title"] = "Guessing Game"
        attributes["Implementation-Version"] = version
        attributes["Main-Class"] = "koty.MainKt"
    }
    from(configurations.runtime.map({ if (it.isDirectory) it else zipTree(it) }))
    with(tasks["jar"] as CopySpec)
}

tasks {
    "build" {
        dependsOn(fatJar)
    }
}
