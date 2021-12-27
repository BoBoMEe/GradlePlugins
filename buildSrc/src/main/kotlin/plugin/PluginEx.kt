package plugin

import org.gradle.api.Project

internal fun Project.configureAppPlugins() {
    plugins.apply("kotlin-android")

}

internal fun Project.configureLibraryPlugins(){
    plugins.apply("kotlin-android")
}