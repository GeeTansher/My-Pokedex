plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdk =33

    defaultConfig {
        applicationId = "com.plcoding.jetpackcomposepokedex"
        minSdk =21
        targetSdk =33
        versionCode =1
        versionName ="1.0"

        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled =false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility =JavaVersion.VERSION_1_8
                targetCompatibility =JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
//        useIR = true
    }
    buildFeatures {
        compose= true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-beta01"
                kotlinCompilerVersion = "1.4.30"
    }
}

dependencies {

    implementation ("androidx.core:core-ktx:1.3.2")
    implementation ("androidx.appcompat:appcompat:1.2.0")
    implementation ("com.google.android.material:material:1.3.0")
    val compose_version = "1.0.0-beta01"
    implementation ("androidx.compose.ui:ui:$compose_version")
    implementation ("androidx.compose.material:material:$compose_version")
    implementation ("androidx.compose.ui:ui-tooling:$compose_version")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("androidx.activity:activity-compose:1.3.0-alpha06")
    testImplementation ("junit:junit:4.+")
    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:$compose_version")

    implementation ("androidx.compose.material:material-icons-core:$compose_version")
    implementation ("androidx.compose.material:material-icons-extended:$compose_version")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha04")
    implementation ("androidx.navigation:navigation-compose:1.0.0-alpha09")
    implementation ("androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha05")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:okhttp:4.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.0")

    // Timber
    implementation ("com.jakewharton.timber:timber:4.7.1")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3")

    // Coroutine Lifecycle Scopes
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")

    // Coil
    implementation ("io.coil-kt:coil:1.1.1")
    implementation ("com.google.accompanist:accompanist-coil:0.7.0")

    //Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.33-beta")
    kapt ("com.google.dagger:hilt-android-compiler:2.33-beta")
    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    kapt ("androidx.hilt:hilt-compiler:1.0.0-beta01")
    implementation ("androidx.hilt:hilt-navigation-compose:1.0.0-alpha01")

    implementation ("com.android.support:palette-v7:28.0.0")
}