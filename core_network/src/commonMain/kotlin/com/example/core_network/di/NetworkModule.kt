package com.example.core_network.di

import com.example.core_network.createApolloClient
import org.koin.dsl.module

val networkModule
    get() = module {
        single { createApolloClient() }
    }