package EXT_ApacheMonitoringExtensionCi

import EXT_ApacheMonitoringExtensionCi.buildTypes.*
import EXT_ApacheMonitoringExtensionCi.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "0da77633-ff02-4f36-9012-ecaee877a2d5"
    id = "EXT_ApacheMonitoringExtensionCi"
    parentId = "EXT"
    name = "Apache Monitoring Extension Ci"

    vcsRoot(EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi)

    buildType(EXT_ApacheMonitoringExtensionCi_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_5"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "EXT_ApacheMonitoringExtension"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
