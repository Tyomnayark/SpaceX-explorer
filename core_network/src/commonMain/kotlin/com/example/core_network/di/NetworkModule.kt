package com.example.core_network.di

import com.example.core_network.createApolloClient
import com.example.core_network.createKtorClient
import org.koin.dsl.module

val networkModule
    get() = module {
        single { createKtorClient() }
        single { createApolloClient(get()) }
    }