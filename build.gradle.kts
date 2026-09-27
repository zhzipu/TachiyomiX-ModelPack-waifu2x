plugins {
    id("com.android.application") version "9.2.1"
}

android {
    namespace = "com.tachiyomix.modelpack.waifu2x"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.tachiyomix.modelpack.waifu2x"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0.0"
        manifestPlaceholders["modelpackId"] = "waifu2x"
        manifestPlaceholders["modelpackName"] = "waifu2x 基础模型"
    }

    packaging {
        jniLibs {
            useLegacyPackaging = true
        }
    }

    lint {
        abortOnError = false
        checkReleaseBuilds = false
    }
}
