package com.example.main_screen.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun LoadingWidget() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White.copy(alpha = 0.5f)
            )
            .clickable {},
        contentAlignment = Alignment.Center
    ) {
        DotsLoader()
    }
}