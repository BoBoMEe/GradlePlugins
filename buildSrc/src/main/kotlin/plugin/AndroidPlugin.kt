package plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create

class AndroidPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.extensions.create<AndroidPluginExtension>("androidExtension")
        target.plugins.config(target)
    }
}