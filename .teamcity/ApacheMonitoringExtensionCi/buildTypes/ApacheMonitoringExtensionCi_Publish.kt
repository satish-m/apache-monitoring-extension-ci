package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType

/**
 * @author Satish Muddam
 */
object ApacheMonitoringExtensionCi_Publish : BuildType({

    uuid = "6C35D3E8-F0D4-44D1-9090-431FF9241F74"
    id = "ApacheMonitoringExtensionCi_Publish"
    name = "Publish"

    vcs {
        root(ApacheMonitoringExtensionCi.vcsRoots.ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs)

    }

    dependencies {
        dependency(ApacheMonitoringExtensionCi_Build) {
            artifacts {
                artifactRules = """
                      *.jar
                    """.trimIndent()
            }
            snapshot {

            }
        }
    }
})