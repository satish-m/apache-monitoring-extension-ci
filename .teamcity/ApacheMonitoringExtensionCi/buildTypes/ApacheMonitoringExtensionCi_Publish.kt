package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven


/**
 * @author Satish Muddam
 */
object ApacheMonitoringExtensionCi_Publish : BuildType({
    uuid = "6AFCB61F-3848-4A30-B764-15931B841E43"
    id = "ApacheMonitoringExtensionCi_Publish"
    name = "Clean"



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
            artifacts {
                artifactRules = """
                      *.jar
                    """.trimIndent()
            }
        }
    }

})