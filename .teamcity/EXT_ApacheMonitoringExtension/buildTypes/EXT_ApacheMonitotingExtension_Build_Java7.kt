package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitotingExtension_Build_Java7 : BuildType ({

    uuid = "10B74DF7-B65B-499A-969B-4173D08EB7AF"
    id = "EXT_ApacheMonitotingExtension_Build_Java7"
    name = "Build in Java7"

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_Apache)

    }

    steps {
        maven {
            goals = "clean test"
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