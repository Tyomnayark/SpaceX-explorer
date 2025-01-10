package com.example.main_screen_domain.mappers

import com.apollographql.apollo3.api.ApolloResponse
import com.example.core_network.RocketsFullQuery
import com.example.main_screen_domain.models.RequestInfoList

fun ApolloResponse<RocketsFullQuery.Data>.toRocketFullInfoModelList(): List<RequestInfoList.RocketFullInfoList> {
    val rockets = this.data?.rockets?.map { rocket ->
        RequestInfoList.RocketFullInfoList(
            id = rocket?.id ?: "",
            name = rocket?.name ?: "",
            description = rocket?.description ?: "",
            active = rocket?.active ?: false,
            costPerLaunch = rocket?.cost_per_launch ?: 0,
            country = rocket?.country ?: "",
            company = rocket?.company ?: "",
//                firstFlight = rocket?.first_flight ?: "",
            stages = rocket?.stages ?: 0,
            successRatePct = rocket?.success_rate_pct ?: 0,
            type = rocket?.type ?: "",
            wikipedia = rocket?.wikipedia ?: "",
            boosters = rocket?.boosters ?: 0
        )
    }.orEmpty()

    return rockets
}