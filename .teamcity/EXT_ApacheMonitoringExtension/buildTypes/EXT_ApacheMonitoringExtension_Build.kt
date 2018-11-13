package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs


/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitoringExtension_Build : BuildType({
    uuid = "22C13277-781E-4138-8549-61191C3EE0DD"
    id = "EXT_ApacheMonitoringExtension_Build"
    name = "Build"

    artifactRules = """
                      target/*.zip
                      target/*.jar
                    """.trimIndent()

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_ApacheMonitoringExtension)
    }

    steps {
        maven {
            goals = "install"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }

    }

    dependencies {
        dependency(EXT_ApacheMonitoringExtension_Compile_Test_Java7) {
            snapshot {

            }
        }
        dependency(EXT_ApacheMonitoringExtension_Compile_Test_Java8) {
            snapshot {

            }
        }
    }

    triggers {
        vcs {
        }
    }

})