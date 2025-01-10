package com.example.main_screen_domain.models

import kotlinx.serialization.Serializable

@Serializable
sealed class RequestInfoList {
    data class RocketBasicInfoList(
        val id: String,
        val name: String
    ) : RequestInfoList()

    data class RocketFullInfoList(
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
    ) : RequestInfoList()
}