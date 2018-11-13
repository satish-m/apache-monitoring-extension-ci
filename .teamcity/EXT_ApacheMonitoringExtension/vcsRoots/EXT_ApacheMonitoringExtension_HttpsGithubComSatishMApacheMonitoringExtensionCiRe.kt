package EXT_ApacheMonitoringExtension.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_ApacheMonitoringExtension_HttpsGithubComSatishMApacheMonitoringExtensionCiRe : GitVcsRoot({
    uuid = "7aedf499-2e1e-40f5-bc11-27ff905161ba"
    id = "EXT_ApacheMonitoringExtension_HttpsGithubComSatishMApacheMonitoringExtensionCiRe"
    name = "https://github.com/satish-m/apache-monitoring-extension-ci#refs/heads/master"
    url = "https://github.com/satish-m/apache-monitoring-extension-ci"
    authMethod = password {
        userName = "satish-m"
        password = "credentialsJSON:a38a850c-54ae-4454-aaaf-efe21a8d5408"
    }
})
