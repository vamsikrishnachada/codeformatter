package com.github.vamsikrishnachada.codeformatter.services

import com.intellij.openapi.project.Project
import com.github.vamsikrishnachada.codeformatter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
