package ExtensionsTest_ApacheMonitoringExtension.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object ExtensionsTest_ApacheMonitoringExtension_SatishGithub : GitVcsRoot({
    uuid = "55347cb7-c1c1-4401-bf10-117b29ed16e9"
    name = "SatishGithub-Apache"
    url = "git@github.com:satish-m/apache-monitoring-extension-ci.git"
    authMethod = uploadedKey {
        uploadedKey = "Satish-Github"
        passphrase = "credentialsJSON:ff8c81a2-cc0c-469e-950d-6ea1fca07eb3"
    }
})
