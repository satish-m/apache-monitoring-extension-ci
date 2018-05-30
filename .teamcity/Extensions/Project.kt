package Extensions

import Extensions.buildTypes.*
import Extensions.vcsRoots.*
import Extensions.vcsRoots.Extensions_AppDynamicsGitHub
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "58d75547-8b05-4d61-94c1-23779b606d61"
    id = "Extensions"
    parentId = "_Root"
    name = "Extensions"
    description = "AppDynamics extensions"

    vcsRoot(Extensions_AppDynamicsGitHub)

    buildType(Extensions_ApacheMonitoringExtension)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.DISABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = Extensions_AppDynamicsGitHub.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
