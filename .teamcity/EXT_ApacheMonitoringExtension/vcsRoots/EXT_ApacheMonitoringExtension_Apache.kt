package EXT_ApacheMonitoringExtension.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_ApacheMonitoringExtension_Apache : GitVcsRoot({
    uuid = "d03c56d6-14da-4c59-993a-b8a52d6e4b04"
    id = "EXT_ApacheMonitoringExtension_Apache"
    name = "Apache"
    url = "git@github.com:satish-m/apache-monitoring-extension-ci.git"
    authMethod = uploadedKey {
        uploadedKey = "ssh-github"
        passphrase = "credentialsJSON:34a47f56-af6b-4133-85c0-70ad8057f7f2"
    }
})
