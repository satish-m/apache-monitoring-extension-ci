package Extensions.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object Extensions_AppDynamicsGitHub : GitVcsRoot({
    uuid = "b207f4bf-79ff-4b79-816b-2dafb05e57d5"
    id = "Extensions_AppDynamicsGitHub"
    name = "AppDynamics GitHub"
    url = "https://github.com/Appdynamics/apache-monitoring-extension"
})
