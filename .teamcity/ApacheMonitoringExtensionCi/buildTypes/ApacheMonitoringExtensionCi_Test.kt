package ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object ApacheMonitoringExtensionCi_Test : BuildType({
    uuid = "666959DC-1804-497B-BA2B-9F94D48184E7"
    id = "ApacheMonitoringExtensionCi_Test"
    name = "Test"

    vcs {
        root(ApacheMonitoringExtensionCi.vcsRoots.ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCiRefs)

    }

    steps {
        maven {
            goals = "test"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_17%"
        }
    }

    dependencies {
        dependency(ApacheMonitoringExtensionCi_Compile) {

        }
    }

    triggers {
        vcs {
        }
    }
})
