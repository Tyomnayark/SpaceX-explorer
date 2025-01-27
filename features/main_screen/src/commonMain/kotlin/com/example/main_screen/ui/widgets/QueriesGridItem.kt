package com.example.main_screen.ui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_resources.Colors
import com.example.main_screen.models.MainPageRequestButton
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun QueriesGridItem(
    modifier: Modifier = Modifier,
    item: MainPageRequestButton,
) {
    Box(
        modifier = modifier
            .padding(5.dp)
            .height(150.dp)
            .border(
                color = Color(0xFFF19E39),
                width = 3.dp,
                shape = RoundedCornerShape(20.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .background(color = Colors.orange, shape = RoundedCornerShape(5.dp))
                .align(
                    Alignment.TopStart
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier
                    .padding(vertical = 5.dp, horizontal = 5.dp),
                text = stringResource(item.typeTextRes),
                fontSize = 18.sp,
                color = Colors.white
            )
        }
        Image(
            painterResource(item.imageRes),
            contentDescription = null,
            modifier = Modifier
                .height(90.dp),
            contentScale = ContentScale.FillHeight
        )
        Text(
            text = stringResource(item.nameTextRes),
            fontSize = 18.sp,
            modifier = Modifier
                .padding(vertical = 10.dp)
                .align(
                    Alignment.BottomCenter
                )
        )
    }
}