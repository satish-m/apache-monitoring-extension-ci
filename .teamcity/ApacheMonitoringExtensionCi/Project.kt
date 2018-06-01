package ApacheMonitoringExtensionCi

import ApacheMonitoringExtensionCi.buildTypes.*
import ApacheMonitoringExtensionCi.vcsRoots.ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "e328aabe-302c-4bbc-9bf8-d3f50abb946a"
    id = "ApacheMonitoringExtensionCi"
    parentId = "_Root"
    name = "Apache Monitoring Extension Ci"

    vcsRoot(ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs)

    buildType(ApacheMonitoringExtensionCi_Clean)
    buildType(ApacheMonitoringExtensionCi_Compile_Test_Java7)
    buildType(ApacheMonitoringExtensionCi_Compile_Test_Java8)

    features {
        versionedSettings {
            id = "PROJECT_EXT_4"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
