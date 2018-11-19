package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitotingExtension_Build_Java8 : BuildType({
    uuid = "DCCBBA22-695C-4FA6-8A35-CDE3FDB17D28"
    id = "EXT_ApacheMonitotingExtension_Build_Java8"
    name = "Test in Java8"

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_Apache)

    }

    steps {
        maven {
            goals = "clean install -Pno-integration-tests"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }
        exec {
            path = "make"
            arguments = "dockerRun"
        }

        maven {
            //Thread.sleep(300000) // Wait for metrics to report

            goals = "clean install"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }

        exec {
            path = "make"
            arguments = "dockerStop"
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

    artifactRules = """
       target/ApacheMonitor-*.zip
    """.trimIndent()

})