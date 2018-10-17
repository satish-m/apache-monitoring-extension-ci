package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object ApacheMonitoringExtensionCi_Compile_Test_Java8 : BuildType({
    uuid = "666959DC-1804-497B-BA2B-9F94D48184E7"
    id = "ApacheMonitoringExtensionCi_Compile_Test_Java8"
    name = "Test Java8"

    vcs {
        root(ApacheMonitoringExtensionCi.vcsRoots.ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs)

    }

    steps {
        maven {
            goals = "test"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }
        exec {
            path = "make"
            arguments = "dockerRun"
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
