package com.example.core_network

import com.apollographql.apollo3.ApolloClient
import com.example.core_network.utils.Constants.BASE_URL

fun createApolloClient(baseUrl: String = BASE_URL): ApolloClient {
    return ApolloClient.Builder()
        .serverUrl(baseUrl)
        .webSocketServerUrl(baseUrl)
        .build()
}