package plugin

import org.gradle.api.Project
import org.gradle.kotlin.dsl.findByType

abstract class AndroidPluginExtension {
    val applicationName: String = ""
}

internal fun Project.applicationName(): String =
    this.extensions.findByType<AndroidPluginExtension>()?.applicationName ?: ""

internal fun Project.isApplication(): Boolean = this.applicationName().isNotEmpty()