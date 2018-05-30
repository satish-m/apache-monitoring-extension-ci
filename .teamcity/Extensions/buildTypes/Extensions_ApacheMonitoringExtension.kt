package Extensions.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven

object Extensions_ApacheMonitoringExtension : BuildType({
    uuid = "213139f6-8b8b-45c1-a19c-3fb8d8045dae"
    id = "Extensions_ApacheMonitoringExtension"
    name = "apache-monitoring-extension"

    vcs {
        root(Extensions.vcsRoots.Extensions_AppDynamicsGitHub)

    }

    steps {
        maven {
            goals = "clean"
        }
        maven {
            goals = "test"
        }
    }

})
