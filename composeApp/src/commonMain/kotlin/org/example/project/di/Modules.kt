package org.example.project.di

import com.example.core_network.di.networkModule
import com.example.main_screen_data.di.mainScreenRepositoryModule
import com.example.main_screen_domain.di.mainScreenUseCaseModule

private val networkModules
    get() = listOf(
        networkModule
    )

private val repositoryModules
    get() = listOf(
        mainScreenRepositoryModule
    )

private val useCaseModules
    get() = listOf(
        mainScreenUseCaseModule
    )

val appModules
    get() = listOf(
        networkModules,
        repositoryModules,
        useCaseModules,
    ).flatten()