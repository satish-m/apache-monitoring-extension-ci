package EXT_ApacheMonitoringExtension

import EXT_ApacheMonitoringExtension.buildTypes.*
import EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_Apache
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "63b13640-6118-40e4-847d-e0916ab54a17"
    id = "EXT_ApacheMonitoringExtension"
    parentId = "EXT"
    name = "ApacheMonitoringExtension"

    vcsRoot(EXT_ApacheMonitoringExtension_Apache)


    buildType(EXT_ApacheMonitoringExtension_VerifyPipeline)

    buildType(EXT_ApacheMonitoringExtension_CleanBuild)
    buildType(EXT_ApacheMonitoringExtension_SetupInLinux)
    buildType(EXT_ApacheMonitoringExtension_IntegrationTestInLinux)
    buildType(EXT_ApacheMonitoringExtension_StopLinux)

    features {
        versionedSettings {
            id = "PROJECT_EXT_8"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = EXT_ApacheMonitoringExtension_Apache.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }

    buildTypesOrder = arrayListOf(
            EXT_ApacheMonitoringExtension_VerifyPipeline,
            EXT_ApacheMonitoringExtension_CleanBuild,
            EXT_ApacheMonitoringExtension_SetupInLinux,
            EXT_ApacheMonitoringExtension_IntegrationTestInLinux,
            EXT_ApacheMonitoringExtension_StopLinux
    )
})
