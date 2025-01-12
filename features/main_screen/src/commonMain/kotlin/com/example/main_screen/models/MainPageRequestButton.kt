package com.example.main_screen.models

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import src.commonMain.composeResources.Res
import src.commonMain.composeResources.base_rocket_icon
import src.commonMain.composeResources.base_rocket_request_text
import src.commonMain.composeResources.users_icon
import src.commonMain.composeResources.full_rocket_icon
import src.commonMain.composeResources.full_rocket_request_text
import src.commonMain.composeResources.query
import src.commonMain.composeResources.subscription
import src.commonMain.composeResources.users_aggregate_info


enum class MainPageRequestButton(
    val nameTextRes: StringResource,
    val typeTextRes: StringResource,
    val imageRes: DrawableResource
) {
    FULL_ROCKETS_INFO(
        nameTextRes = Res.string.full_rocket_request_text,
        typeTextRes = Res.string.query,
        imageRes = Res.drawable.full_rocket_icon
    ),
    BASIC_ROCKETS_INFO(
        nameTextRes = Res.string.base_rocket_request_text,
        typeTextRes = Res.string.query,
        imageRes = Res.drawable.base_rocket_icon
    ),
    USERS_AGGREGATE_INFO(
        nameTextRes = Res.string.users_aggregate_info,
        typeTextRes = Res.string.subscription,
        imageRes = Res.drawable.users_icon
    )
}
