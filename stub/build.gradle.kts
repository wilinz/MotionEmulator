plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlinx-serialization")
}

android {
    namespace = "com.zhufucdev.stub"
    compileSdk = Versions.targetSdk

    defaultConfig {
        minSdk = Versions.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}


dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineVersion}")
    implementation("com.google.guava:guava:31.1-android")
    implementation("com.aventrix.jnanoid:jnanoid:2.0.0")
    implementation("com.github.Redempt:Crunch:1.1.2")
    // Maps)
    implementation("com.google.maps.android:android-maps-utils:3.4.0")
    implementation("com.google.android.gms:play-services-maps:18.1.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}