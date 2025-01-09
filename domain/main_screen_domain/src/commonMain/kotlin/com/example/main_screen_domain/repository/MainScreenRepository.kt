package com.example.main_screen_domain.repository

import com.apollographql.apollo3.api.ApolloResponse
import com.example.core_network.RocketsFullQuery

interface MainScreenRepository {

    suspend fun requestFullRocketsInfo() : ApolloResponse<RocketsFullQuery.Data>

}