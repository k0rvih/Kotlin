package Kotlin.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*

object Kotlin_HelloWorld : BuildType({
    name = "Hello world"

    steps {
        step {
            name = "Restore Nuget Packages"
            type = "jb.nuget.installer"
            param("nuget.path", "%teamcity.tool.NuGet.CommandLine.DEFAULT%")
            param("nuget.updatePackages.mode", "sln")
            param("sln.path", "%SolutionPath%")
        }
    }
})
