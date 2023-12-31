plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlinx-serialization")
}

android {
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
    }

    namespace = "eu.kanade.tachiyomi.lib.randomua"
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(libs.bundles.common)
}
