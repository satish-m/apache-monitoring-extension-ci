package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitoringExtension_Build : BuildType({

    uuid = "CC3B39E1-262E-4B85-8E2F-481C05CB41FC"
    id = "EXT_ApacheMonitoringExtension_Build"
    name = "Build"

    artifactRules = """
                      target/*.zip
                      target/*.jar
                    """.trimIndent()

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_Apache)

    }

    steps {
        maven {
            goals = "install"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }

    }

    dependencies {
        dependency(EXT_ApacheMonitotingExtension_Build_Java7) {
            snapshot {

            }
        }
        dependency(EXT_ApacheMonitotingExtension_Build_Java8) {
            snapshot {

            }
        }
    }

    triggers {
        vcs {
        }
    }

})