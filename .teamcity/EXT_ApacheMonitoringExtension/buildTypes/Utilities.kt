package EXT_ApacheMonitoringExtension.buildTypes

import EXT_ApacheMonitoringExtension.vcsRoots.EXT_ApacheMonitoringExtension_Apache
import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildFeatures.commitStatusPublisher

/**
 * @author Satish Muddam
 */

fun BuildType.publishCommitStatus() {
    features {
        commitStatusPublisher {
            vcsRootExtId = EXT_ApacheMonitoringExtension_Apache.id
            publisher = github {
                githubUrl = "git@github.com:satish-m/apache-monitoring-extension-ci.git"
                authType = personalToken {
                    token = "bc0c97a111deb9aef76d5ea2b212918f9565ca63"
                }
            }
        }
    }
}
