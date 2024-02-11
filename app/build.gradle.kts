plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("com.google.gms.google-services")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.studeasee"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.studeasee"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        viewBinding= true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.core:core:1.12.0")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.google.android.libraries.places:places:3.3.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation(platform("com.google.firebase:firebase-bom:32.7.2"))
    implementation("com.google.firebase:firebase-auth")
    implementation ("com.google.firebase:firebase-database-ktx:20.3.0")
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation ("com.mesibo.api:webrtc:1.0.5")
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")
    implementation ("com.guolindev.permissionx:permissionx:1.6.1")
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
    implementation ("com.google.maps.android:android-maps-utils:3.8.0")
    implementation ("com.google.maps.android:maps-utils-ktx:5.0.0")
}