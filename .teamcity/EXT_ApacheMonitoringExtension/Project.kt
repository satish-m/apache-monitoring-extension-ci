package EXT_ApacheMonitoringExtension

import EXT_ApacheMonitoringExtension.vcsRoots.*
import EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_ApacheMonitoringExtension
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "95e2aa25-051d-4109-88a4-297b9949ac91"
    id = "EXT_ApacheMonitoringExtension"
    parentId = "EXT"
    name = "Apache Monitoring Extension"

    vcsRoot(EXT_ApacheMonitoringExtension_ApacheMonitoringExtension)

    features {
        versionedSettings {
            id = "PROJECT_EXT_6"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = EXT_ApacheMonitoringExtension_ApacheMonitoringExtension.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
