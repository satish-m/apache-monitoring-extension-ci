package EXT_ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object EXT_ApacheMonitoringExtensionCi_Build : BuildType({
    uuid = "b0530746-262d-4abf-a777-bb33e7d17dd3"
    id = "EXT_ApacheMonitoringExtensionCi_Build"
    name = "Build"

    vcs {
        root(EXT_ApacheMonitoringExtensionCi.vcsRoots.EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi)

    }

    triggers {
        vcs {
        }
    }
})
