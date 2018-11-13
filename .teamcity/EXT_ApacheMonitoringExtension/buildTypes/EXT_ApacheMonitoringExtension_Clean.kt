package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitoringExtension_Clean : BuildType({

    uuid = "1375A99B-2D57-47E0-9A3A-E6F963415AF8"
    id = "EXT_ApacheMonitoringExtension_Clean"
    name = "Clean"

    vcs {
        root(EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_Apache)

    }

    steps {
        maven {
            goals = "clean"
            mavenVersion = defaultProvidedVersion()
        }
    }

    triggers {
        vcs {
        }
    }

})