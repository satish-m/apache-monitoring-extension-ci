package EXT_ApacheMonitoringExtension.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_ApacheMonitoringExtension_HttpsGithubComSatishMApacheMonitoringExtensionCiRe : GitVcsRoot({
    uuid = "dedc8275-cdcd-4770-ad5f-e39f61198f6a"
    id = "EXT_ApacheMonitoringExtension_HttpsGithubComSatishMApacheMonitoringExtensionCiRe"
    name = "https://github.com/satish-m/apache-monitoring-extension-ci#refs/heads/master"
    url = "https://github.com/satish-m/apache-monitoring-extension-ci"
    authMethod = password {
        userName = "satish-m"
        password = "credentialsJSON:d5d6eb73-72c8-4e2d-938e-4fbbc7b30ced"
    }
})
