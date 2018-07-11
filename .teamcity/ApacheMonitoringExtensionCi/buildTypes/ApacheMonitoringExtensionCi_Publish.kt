package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType

/**
 * @author Satish Muddam
 */
object ApacheMonitoringExtensionCi_Publish : BuildType({

    uuid = "D7EDEC38-45FC-43FD-ACDA-B41BA7534AC4"
    id = "ApacheMonitoringExtensionCi_Publish"
    name = "Publish"


    dependencies {
        dependency(ApacheMonitoringExtensionCi_Build) {
            artifacts {
                artifactRules = """
                      *.jar
                    """.trimIndent()
            }
        }
    }
})