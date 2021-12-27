package plugin

import AndroidDefalutConfig
import com.android.build.gradle.*
import com.android.build.gradle.AppExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.api.plugins.PluginContainer
import org.gradle.kotlin.dsl.getByType

internal fun PluginContainer.config(project: Project) {
    whenPluginAdded {
        when (this) {
            //com.android.application
            is AppPlugin -> {
                //com.android.application
                project.configureAppPlugins()
                project.configureApp()
                project.configureAppDeps()
            }
            is LibraryPlugin ->{
                //com.android.library
                project.configureLibraryPlugins()
                project.configureLibrary()
                project.configureLibraryDeps()
            }
        }
    }
}

internal fun Project.configureApp() = this.extensions.getByType<AppExtension>().run {
    defaultConfig {
        applicationId = AndroidDefalutConfig.applicationId
        versionCode = AndroidDefalutConfig.versionCode
        versionName = AndroidDefalutConfig.versionName
    }
    configureBase(project)
}

internal fun Project.configureLibrary() = this.extensions.getByType<LibraryExtension>().run {
    configureBase(project)
}