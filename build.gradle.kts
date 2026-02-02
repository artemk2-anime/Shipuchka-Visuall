plugins {
    id("fabric-loom") version "1.7-SNAPSHOT"
    id("maven-publish")
}

group = "ru.shipuchka"
version = "1.0.0"

repositories {
    maven("https://maven.fabricmc.net/")
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.20.1")
    mappings("net.fabricmc:yarn:1.20.1+build.10:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.11")
}

tasks.processResources {
    inputs.property("version", project.version)
}
