package com.example.main_screen.models

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import src.commonMain.composeResources.Res
import src.commonMain.composeResources.base_rocket_icon
import src.commonMain.composeResources.full_rocket_icon
import src.commonMain.composeResources.full_rocket_request_text
import src.commonMain.composeResources.base_rocket_request_text


enum class MainPageRequestButton(
    val textRes: StringResource,
    val imageRes: DrawableResource
) {
    FULL_ROCKETS_INFO(
        textRes = Res.string.full_rocket_request_text,
        imageRes = Res.drawable.full_rocket_icon
    ),
    BASIC_ROCKETS_INFO(
        textRes = Res.string.base_rocket_request_text,
        imageRes = Res.drawable.base_rocket_icon
    )
}
