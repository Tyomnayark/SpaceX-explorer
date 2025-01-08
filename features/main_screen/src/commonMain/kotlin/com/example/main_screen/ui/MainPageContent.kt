package com.example.main_screen.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun MainPageContent(component: MainPageComponent) {

    val text = component.text.collectAsStateWithLifecycle()

    Column {
        Text(text.value)
        Box(
            modifier = Modifier
                .height(13.dp)
                .width(100.dp)
                .background(color = Color.Black)
                .clickable {
                    component.onButtonClick()
                }
        )
    }
}