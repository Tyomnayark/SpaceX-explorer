package org.example.project.di

import com.example.main_screen.di.mainScreenModule

private val featureModules
    get() = listOf(
        mainScreenModule
    )

val appModules
    get() = listOf(
        featureModules,
    ).flatten()