package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_ApacheMonitoringExtension_VerifyPipeline : BuildType({
    template = "VerifyPipeline"
    uuid = "35C83B30-3647-4A03-B729-1B531B9C6C0C"
    id = "EXT_ApacheMonitoringExtension_VerifyPipeline"
    name = "Verify Pipeline"
    description = "Verify TeamCity Pipeline"


    publishCommitStatus()
})