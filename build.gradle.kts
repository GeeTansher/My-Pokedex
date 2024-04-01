// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "8.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

buildscript {
//    ext {
//        compose_version = "1.0.0-beta01"
//    }
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.0.0-alpha12")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.31.2-alpha")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


tasks.register("clean") {
    doLast {
        delete()
    }
}
