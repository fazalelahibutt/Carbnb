// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("org.sonarqube") version "4.4.1.3373" apply false
  
id("org.jetbrains.kotlinx.kover") version "0.7.3"

}

// Remove the duplicate 'clean' task if it exists in other files
// This is the only place the clean task should be defined
tasks.register("clean", Delete::class) {
    delete(project.layout.buildDirectory)
}

