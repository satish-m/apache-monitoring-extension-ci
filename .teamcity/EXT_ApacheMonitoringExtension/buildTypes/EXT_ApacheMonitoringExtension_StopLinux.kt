package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitoringExtension_StopLinux : BuildType({
    uuid = "A7801B18-7E1C-4656-ACC6-E36ECEA66156"
    id = "EXT_ApacheMonitoringExtension_StopLinux"
    name = "Stop Linux docker"

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_Apache)

    }

    steps {
        exec {
            path = "make"
            arguments = "dockerStop"
        }
    }

    dependencies {
        dependency(EXT_ApacheMonitoringExtension_IntegrationTestInLinux) {
            snapshot {

            }
        }
    }

    publishCommitStatus()

    triggers {
        vcs {
        }
    }
})