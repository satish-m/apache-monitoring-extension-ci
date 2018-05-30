package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object ApacheMonitoringExtensionCi_Build : BuildType({
    uuid = "0bfdf68e-6ef0-4254-b5d9-9fc4217fd772"
    id = "ApacheMonitoringExtensionCi_Build"
    name = "Build"

    vcs {
        root(ApacheMonitoringExtensionCi.vcsRoots.ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs)

    }

    steps {
        maven {
            goals = "clean test"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_17%"
        }
    }

    triggers {
        vcs {
        }
    }
})
