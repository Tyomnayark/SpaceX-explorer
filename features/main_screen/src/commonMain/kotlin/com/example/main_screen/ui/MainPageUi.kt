package com.example.main_screen.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun MainPageUi(component: MainPageComponent) {

    val buttons = component.buttons.collectAsStateWithLifecycle()
    val lazyGridState = rememberLazyGridState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        state = lazyGridState,
        modifier = Modifier.padding(30.dp)
    ) {
        itemsIndexed(buttons.value) { index, item ->
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .height(150.dp)
                    .border(
                        color = Color(0xFFF19E39),
                        width = 3.dp,
                        shape = RoundedCornerShape(20.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painterResource(item.imageRes),
                    contentDescription = null,
                    modifier = Modifier
                        .height(90.dp),
                    contentScale = ContentScale.FillHeight
                )
                Text(
                    text = stringResource(item.textRes),
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                        .align(
                            Alignment.BottomCenter
                        )
                )
            }
        }
    }
}