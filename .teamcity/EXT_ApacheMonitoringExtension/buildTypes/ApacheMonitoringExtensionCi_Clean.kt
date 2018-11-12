package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object ApacheMonitoringExtensionCi_Clean : BuildType({
    uuid = "C5D5FE07-806F-4169-B865-7071EBD62838"
    id = "ApacheMonitoringExtensionCi_Clean"
    name = "Clean"

    vcs {
        root(ApacheMonitoringExtensionCi.vcsRoots.ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs)

    }

    steps {
        maven {
            goals = "clean"
            mavenVersion = defaultProvidedVersion()
        }
    }

    triggers {
        vcs {
        }
    }
})