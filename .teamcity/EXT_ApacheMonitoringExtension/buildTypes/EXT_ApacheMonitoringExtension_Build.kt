package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitoringExtension_Build : BuildType({
    uuid = "8ae04611-4cb4-4e71-97ac-95570f17f4b1"
    id = "EXT_ApacheMonitoringExtension_Build"
    name = "Build"

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
