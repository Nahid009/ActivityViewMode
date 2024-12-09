import org.jetbrains.kotlin.storage.CacheResetOnProcessCanceled.enabled

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.nahidd.viewmodelandroidkotlin"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.nahidd.viewmodelandroidkotlin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }


    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // Update ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2") // Latest version
// Update LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2") // Latest version
// Optional: ViewModel SavedState (for handling saved state)
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.6.2")
// Optional: Lifecycle Runtime (essential for Android lifecycle components)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
// Optional: Lifecycle Common (for lifecycle annotations)
    implementation("androidx.lifecycle:lifecycle-common-java8:2.6.2")
// Optional: If you want Lifecycle service support (e.g., for WorkManager, etc.)
    implementation("androidx.lifecycle:lifecycle-service:2.6.2")

}