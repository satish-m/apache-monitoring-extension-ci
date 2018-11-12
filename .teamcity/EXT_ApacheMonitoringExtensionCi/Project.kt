package EXT_ApacheMonitoringExtensionCi

import EXT_ApacheMonitoringExtensionCi.buildTypes.*
import EXT_ApacheMonitoringExtensionCi.vcsRoots.*
import EXT_ApacheMonitoringExtensionCi.vcsRoots.EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "218d7f49-9b1b-4769-83a4-97318f9618b8"
    id = "EXT_ApacheMonitoringExtensionCi"
    parentId = "EXT"
    name = "Apache Monitoring Extension Ci"

    vcsRoot(EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi)

    buildType(EXT_ApacheMonitoringExtensionCi_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_CURRENT_SETTINGS
            rootExtId = EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
