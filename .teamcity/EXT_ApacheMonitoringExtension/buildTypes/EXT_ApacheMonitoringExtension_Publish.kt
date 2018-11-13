package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType

/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitoringExtension_Publish : BuildType({

    uuid = "6C35D3E8-F0D4-44D1-9090-431FF9241F74"
    id = "EXT_ApacheMonitoringExtension_Publish"
    name = "Publish"

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_ApacheMonitoringExtension)
    }
})