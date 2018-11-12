package ApacheMonitoringExtensionCi.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = '9A899D45-BD48-41AB-8EA8-8FD2F0540BC9' (id = 'ApacheMonitoringExtensionCi_Build')
accordingly and delete the patch script.
*/
changeBuildType("9A899D45-BD48-41AB-8EA8-8FD2F0540BC9") {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}