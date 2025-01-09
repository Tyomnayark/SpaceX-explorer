package com.example.main_screen_domain.di

import com.example.main_screen_domain.interfaces.GetRocketsFullInfoUseCase
import com.example.main_screen_domain.usecases.GetRocketsFullInfoUseCaseImpl
import org.koin.dsl.module

val mainScreenUseCaseModule
    get() = module {
        single<GetRocketsFullInfoUseCase> {
            GetRocketsFullInfoUseCaseImpl(
                mainScreenRepository = get()
            )
        }
    }