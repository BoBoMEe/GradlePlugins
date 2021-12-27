package plugin

import org.gradle.api.Project


internal fun Project.configureAppDeps() = dependencies.apply {
    add("implementation", (fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar")))))

}

internal fun Project.configureLibraryDeps()= dependencies.apply {
    add("api", (fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar")))))
}