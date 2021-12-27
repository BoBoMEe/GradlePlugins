import VersionConfig.GRADLE_VERSION
import VersionConfig.KOTLIN_VERSION

object VersionConfig {
    //Gradle 版本
    const val GRADLE_VERSION = "7.0.2"

    //Kotlin 版本
    const val KOTLIN_VERSION = "1.6.0"
}

object ClasspathConfig {
    // agp 插件
    const val GRADLE_CLASSPATH = "com.android.tools.build:gradle:${GRADLE_VERSION}"

    // agp-kotlin 插件
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KOTLIN_VERSION}"
}

object AndroidDefalutConfig {
    //依赖版本
    const val compileSdkVersion = 29

    //包名
    const val applicationId = "com.bobomee.gradleplugins"

    //最小支持SDK
    const val minSdkVersion = 21

    //当前基于SDK
    const val targetSdkVersion = 29

    //版本编码
    const val versionCode = 1

    //版本名称
    const val versionName = "1.0"
}

object DependenciesConfig {
    //Kotlin基础库
    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${KOTLIN_VERSION}"

    //Android标准库
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.1.0"

    //Kotlin核心库
    const val KTX_CORE = "androidx.core:core-ktx:1.2.0"
}
