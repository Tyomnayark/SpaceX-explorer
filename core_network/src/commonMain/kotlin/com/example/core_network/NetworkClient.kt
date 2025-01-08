package com.example.core_network

import com.apollographql.apollo.ApolloClient
import com.apollographql.ktor.http.KtorHttpEngine
import com.apollographql.ktor.ktorClient
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.*

fun createKtorClient(): HttpClient {
    return HttpClient {
        install(HttpTimeout) {
            requestTimeoutMillis = 10000
            connectTimeoutMillis = 5000
            socketTimeoutMillis = 15000
        }
        install(ContentNegotiation) {
            json()
        }
    }
}


fun createApolloClient(httpClient: HttpClient, baseUrl: String): ApolloClient {
    return ApolloClient.Builder()
        .serverUrl(baseUrl)
        .httpEngine(KtorHttpEngine())
        .ktorClient(httpClient)
        .build()
}