package com.example.info_screen.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.main_screen_domain.models.RequestInfoList

@Composable
fun BasicRocketInfoItem(
    modifier: Modifier = Modifier,
    basicInfo: RequestInfoList.RocketBasicInfoList
)  {
    Box(
        modifier = modifier
            .padding(vertical = 5.dp)
            .height(40.dp)
            .width(200.dp)
            .border(
                color = Color(0xFFF19E39),
                width = 3.dp,
                shape = RoundedCornerShape(10.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = basicInfo.name,
            fontSize = 25.sp,
        )
    }
}

