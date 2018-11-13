package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object ApacheMonitoringExtension_Compile_Test_Java7 : BuildType({
    uuid = "0bfdf68e-6ef0-4254-b5d9-9fc4217fd772"
    id = "ApacheMonitoringExtension_Compile_Test_Java7"
    name = "Test Java7"

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_ApacheMonitoringExtension)
    }

    steps {
        maven {
            goals = "test"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_17%"
        }
    }

    dependencies {
        dependency(EXT_ApacheMonitoringExtension_Clean) {
            snapshot {

            }
        }
    }

    triggers {
        vcs {
        }
    }
})
