package com.github.krishna423.coderactifier.services

import com.intellij.openapi.project.Project
import com.github.krishna423.coderactifier.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
