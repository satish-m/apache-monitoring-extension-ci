package ApacheMonitoringExtensionCi.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs : GitVcsRoot({
    uuid = "36fb3b9a-6adb-4470-8054-ff148d7f9f54"
    id = "ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs"
    name = "https://github.com/satish-m/apache-monitoring-extension-ci#refs/heads/master"
    url = "https://github.com/satish-m/apache-monitoring-extension-ci"
    authMethod = password {
        userName = "satish-m"
        password = "credentialsJSON:19dd4361-447e-40c7-acf5-30dc7da915be"
    }
})
