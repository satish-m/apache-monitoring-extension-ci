package EXT_ApacheMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.dockerBuild
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.dockerCompose
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object EXT_ApacheMonitoringExtensionCi_Build : BuildType({
    uuid = "28c15d84-e5c9-4a55-8cf9-4af9b63cfa09"
    id = "EXT_ApacheMonitoringExtensionCi_Build"
    name = "Build"

    vcs {
        root(EXT_ApacheMonitoringExtensionCi.vcsRoots.EXT_ApacheMonitoringExtensionCi_HttpsGithubComSatishMApacheMonitoringExtensionCi)

    }

    steps {
        maven {
            goals = "clean test"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_17%"
        }
        dockerCompose {
            file = "docker-compose.yml"
        }
        dockerBuild {
            source = path {
                path = "Dockerfile"
            }
        }
    }

    triggers {
        vcs {
        }
    }
})
