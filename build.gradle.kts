android {
    namespace = "com.example.estarlink"


    compileOptions {
        buildToolsVersion = "34.0.0"
        ndkVersion = "27.0.11902837 rc2"
        compileSdk = 34
    }
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.


plugins {
    alias(libs.plugins.android.application) apply true
    alias(libs.plugins.jetbrains.kotlin.android) apply true
    alias(libs.plugins.google.gms.google.services) apply true
    alias(libs.plugins.google.firebase.crashlytics) apply true
    }