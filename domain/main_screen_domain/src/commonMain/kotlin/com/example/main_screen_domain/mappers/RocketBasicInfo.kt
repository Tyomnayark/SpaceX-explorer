package com.example.main_screen_domain.mappers

import com.apollographql.apollo3.api.ApolloResponse
import com.example.core_network.RocketsBasicQuery
import com.example.main_screen_domain.models.RequestInfoList

fun ApolloResponse<RocketsBasicQuery.Data>.toRocketBasicInfo(): List<RequestInfoList.RocketBasicInfoList> {
    val rockets = this.data?.rockets?.map { rocket ->
        RequestInfoList.RocketBasicInfoList(
            id = rocket?.id ?: "",
            name = rocket?.name ?: "",
        )
    }.orEmpty()

    return rockets
}
