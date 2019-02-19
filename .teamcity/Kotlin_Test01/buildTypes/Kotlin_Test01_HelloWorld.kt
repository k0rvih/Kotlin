package Kotlin_Test01.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.powerShell

object Kotlin_Test01_HelloWorld : BuildType({
    name = "Build config"

    steps {
        step {
            name = "Step01"
            type = "jb.nuget.installer"
            param("nuget.path", "%teamcity.tool.NuGet.CommandLine.DEFAULT%")
            param("nuget.updatePackages.mode", "sln")
            param("sln.path", "%SolutionPath%")
        }
        powerShell {
            name = "Step02"
            scriptMode = script {
                content = "Get-ChildItem"
            }
        }
    }
})
