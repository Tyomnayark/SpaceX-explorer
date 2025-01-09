package com.example.main_screen_data.repository

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.ApolloResponse
import com.example.core_network.RocketsFullQuery
import com.example.main_screen_domain.repository.MainScreenRepository

class MainScreenRepositoryImpl(
    private val apolloClient: ApolloClient
) : MainScreenRepository {
    override suspend fun requestFullRocketsInfo(): ApolloResponse<RocketsFullQuery.Data> {
        val response: ApolloResponse<RocketsFullQuery.Data> =
            apolloClient.query(RocketsFullQuery()).execute()

        if (response.hasErrors()) {
            throw Exception("GraphQL errors: ${response.errors}")
        }
        return response
    }
}