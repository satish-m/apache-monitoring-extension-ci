package EXT_ApacheMonitoringExtension.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_ApacheMonitoringExtension_ApacheMonitoringExtension : GitVcsRoot({
    uuid = "ffe39841-655c-4442-923e-2d21ad486ac2"
    id = "EXT_ApacheMonitoringExtension_ApacheMonitoringExtension"
    name = "ApacheMonitoringExtension"
    url = "git@github.com:satish-m/apache-monitoring-extension-ci.git"
    authMethod = uploadedKey {
        uploadedKey = "ssh-github"
        passphrase = "credentialsJSON:2364da16-b22a-4314-b34e-4b20f6f0317a"
    }
})
