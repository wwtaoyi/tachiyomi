buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:3.2.1")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Deps.kotlin.version}")
  }
}

plugins {
  id("com.github.ben-manes.versions") version "0.20.0"
}

allprojects {
  repositories {
    google()
    jcenter()
    maven { setUrl("https://jitpack.io") }
    maven { setUrl("https://google.bintray.com/flexbox-layout") }
  }
}
