package com.example.main_screen_domain.models

import com.apollographql.apollo3.api.ApolloResponse
import com.example.core_network.RocketsFullQuery

data class RocketFullInfoModel(
    val active: Boolean,
    val boosters: Int,
    val company: String,
    val costPerLaunch: Int,
    val country: String,
    val description: String,
//    val firstFlight: String,
    val id: String,
    val name: String,
    val stages: Int,
    val successRatePct: Int,
    val type: String,
    val wikipedia: String
)

fun ApolloResponse<RocketsFullQuery.Data>.toRocketFullInfoModelList(): List<RocketFullInfoModel> {
    val rockets = this.data?.rockets?.map { rocket ->
        RocketFullInfoModel(
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