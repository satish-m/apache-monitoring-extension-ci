package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object EXT_ApacheMonitoringExtension_Build : BuildType({
    uuid = "679d19d3-836c-45f6-bf83-226938e45c9a"
    id = "EXT_ApacheMonitoringExtension_Build"
    name = "Build"

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_HttpsGithubComSatishMApacheMonitoringExtensionCiRe)

    }

    triggers {
        vcs {
        }
    }
})
