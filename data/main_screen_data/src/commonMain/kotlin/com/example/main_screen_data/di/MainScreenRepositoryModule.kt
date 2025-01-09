package com.example.main_screen_data.di

import com.example.main_screen_data.repository.MainScreenRepositoryImpl
import com.example.main_screen_domain.repository.MainScreenRepository
import org.koin.dsl.module

val mainScreenRepositoryModule
    get() = module {
        single<MainScreenRepository> { MainScreenRepositoryImpl(get()) }
    }