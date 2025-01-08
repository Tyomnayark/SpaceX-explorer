package org.example.project.di

import com.example.core_network.di.networkModule
import com.example.main_screen.di.mainScreenModule

private val featureModules
    get() = listOf(
        mainScreenModule,
    )

private val networkModules
    get() = listOf(
        networkModule
    )

val appModules
    get() = listOf(
        featureModules,
        networkModules
    ).flatten()