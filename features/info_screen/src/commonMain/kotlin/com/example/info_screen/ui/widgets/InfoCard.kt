package com.example.info_screen.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_resources.Colors

@Composable
fun InfoCard(
    modifier: Modifier = Modifier,
    isDecorationNeed: Boolean = false,
    text: String,
    color: Color = Colors.orange,
    textColor: Color = Colors.white
) {
    Box(
        modifier = modifier
            .padding(vertical = 5.dp)
            .height(IntrinsicSize.Min)
            .defaultMinSize(200.dp, 40.dp)
    ) {
        if (isDecorationNeed) {
            Box(
                Modifier
                    .fillMaxSize()
                    .offset(
                        x = (-20).dp,
                        y = (-10).dp
                    )
                    .drawBehind {
                        drawLine(
                            color = Colors.darkGrey,
                            start = Offset(0f, -30f),
                            end = Offset(0f, size.height),
                            strokeWidth = 10f
                        )
                        drawLine(
                            color = Colors.darkGrey,
                            start = Offset(-5f, size.height),
                            end = Offset(70f, size.height),
                            strokeWidth = 10f
                        )
                    }
            )
        }

        Box(
            modifier = modifier
                .background(
                    color = color,
                    shape = RoundedCornerShape(10.dp)
                ),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = text,
                fontSize = 25.sp,
                color = textColor,
                modifier = Modifier
                    .padding(vertical = 5.dp, horizontal = 10.dp)
            )
        }

    }
}