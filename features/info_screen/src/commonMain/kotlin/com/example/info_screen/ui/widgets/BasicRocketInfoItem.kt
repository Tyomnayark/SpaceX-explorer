package com.example.info_screen.ui.widgets

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.main_screen_domain.models.RequestInfoList

@Composable
fun BasicRocketInfoItem(
    modifier: Modifier = Modifier,
    basicInfo: RequestInfoList.RocketBasicInfoList
)  {
    InfoCard(
        modifier = modifier,
        text = basicInfo.name
    )
}

