package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs


/**
 * @author Satish Muddam
 */
object ApacheMonitoringExtensionCi_Build : BuildType({
    uuid = "9A899D45-BD48-41AB-8EA8-8FD2F0540BC9"
    id = "ApacheMonitoringExtensionCi_Build"
    name = "Build"

    artifactRules = """
                      *.zip
                    """.trimIndent()

    vcs {
        root(ApacheMonitoringExtensionCi.vcsRoots.ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs)

    }

    steps {
        maven {
            goals = "install"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }

    }

    dependencies {
        dependency(ApacheMonitoringExtensionCi_Compile_Test_Java7) {
            snapshot {

            }
        }
        dependency(ApacheMonitoringExtensionCi_Compile_Test_Java8) {
            snapshot {

            }
        }
    }

    triggers {
        vcs {
        }
    }

})