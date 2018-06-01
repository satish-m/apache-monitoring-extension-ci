package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object ApacheMonitoringExtensionCi_Compile_Test_Java7 : BuildType({
    uuid = "0bfdf68e-6ef0-4254-b5d9-9fc4217fd772"
    id = "ApacheMonitoringExtensionCi_Compile_Test_Java7"
    name = "Test Java7"

    vcs {
        root(ApacheMonitoringExtensionCi.vcsRoots.ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs)

    }

    steps {
        maven {
            goals = "test"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_17%"
        }
    }

    dependencies {
        dependency(ApacheMonitoringExtensionCi_Clean) {
            snapshot {

            }
        }
    }

    triggers {
        vcs {
        }
    }
})