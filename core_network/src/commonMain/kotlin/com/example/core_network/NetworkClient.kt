package com.example.core_network

import com.apollographql.apollo.ApolloClient
import com.apollographql.ktor.http.KtorHttpEngine
import com.apollographql.ktor.ktorClient
import com.example.core_network.utils.Constants.BASE_URL
import com.example.core_network.utils.Constants.CONNECT_TIMEOUT
import com.example.core_network.utils.Constants.REQUEST_TIMEOUT
import com.example.core_network.utils.Constants.SOCKET_TIMEOUT
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.*


fun createKtorClient(): HttpClient {
    return HttpClient {
        install(HttpTimeout) {
            requestTimeoutMillis = REQUEST_TIMEOUT
            connectTimeoutMillis = CONNECT_TIMEOUT
            socketTimeoutMillis = SOCKET_TIMEOUT
        }
        install(ContentNegotiation) {
            json()
        }
    }
}


fun createApolloClient(httpClient: HttpClient, baseUrl: String = BASE_URL): ApolloClient {
    return ApolloClient.Builder()
        .serverUrl(baseUrl)
        .httpEngine(KtorHttpEngine())
        .ktorClient(httpClient)
        .build()
}