object Versions {
    const val androidGradlePlugin = "3.3.1"
    const val androidX = "1.0.0"
    const val assertJ = "3.11.1"
    const val constraintlayout = "1.1.3"
    const val coroutinesCore = "1.1.1"
    const val groupie = "2.3.0"
    const val glide = "4.8.0"
    const val junit = "4.12"
    const val koin = "1.0.2"
    const val kotlin = "1.3.21"
    const val lifecycle = "2.0.0"
    const val mockk = "1.9.1"
    const val mockWebServer = "3.11.0"
    const val moshi = "1.8.0"
    const val okHttp = "3.11.0"
    const val retrofit = "2.5.0"
    const val retrofitCoroutinesAdapter = "0.9.2"
}

object Dependencies {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.androidX}"
    const val cardView = "androidx.cardview:cardview:${Versions.androidX}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.androidX}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesCore}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val glideOkHttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"
    const val groupie = "com.xwray:groupie:${Versions.groupie}"
    const val groupieKotlinAndroidExtension = "com.xwray:groupie-kotlin-android-extensions:${Versions.groupie}"
    const val koinCore = "org.koin:koin-core:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val livecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val materialDesign = "com.google.android.material:material:${Versions.androidX}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.androidX}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitCoroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutinesAdapter}"
    const val retrofitConverterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
}


object TestDependencies {
    const val archCoreTesting = "android.arch.core:core-testing:${Versions.lifecycle}"
    const val assertJ = "org.assertj:assertj-core:${Versions.assertJ}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesCore}"
    const val junit = "junit:junit:${Versions.junit}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"
}
