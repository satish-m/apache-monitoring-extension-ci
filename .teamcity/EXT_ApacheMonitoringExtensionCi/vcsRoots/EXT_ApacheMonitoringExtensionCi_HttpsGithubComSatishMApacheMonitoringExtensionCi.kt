package EXT_ApacheMonitoringExtensionCi.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi : GitVcsRoot({
    uuid = "ec0fed1c-3ded-4f81-b225-f48ac68a546e"
    id = "EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi"
    name = "https://github.com/satish-m/apache-monitoring-extension-ci#refs/heads/master"
    url = "https://github.com/satish-m/apache-monitoring-extension-ci"
    authMethod = password {
        userName = "satish-m"
        password = "credentialsJSON:19dd4361-447e-40c7-acf5-30dc7da915be"
    }
})
