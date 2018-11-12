package EXT_ApacheMonitoringExtensionCi.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi : GitVcsRoot({
    uuid = "4e4103eb-5a15-41d1-a54e-028e0f82a44d"
    id = "EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi"
    name = "https://github.com/satish-m/apache-monitoring-extension-ci#refs/heads/master"
    url = "https://github.com/satish-m/apache-monitoring-extension-ci"
    authMethod = password {
        userName = "satish-m"
        password = "credentialsJSON:19dd4361-447e-40c7-acf5-30dc7da915be"
    }
})
