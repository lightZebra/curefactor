package com.github.lightzebra.curefactor.services

import com.intellij.openapi.project.Project
import com.github.lightzebra.curefactor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
