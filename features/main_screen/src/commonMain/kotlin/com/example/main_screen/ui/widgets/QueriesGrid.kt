package com.example.main_screen.ui.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.main_screen.models.MainPageRequestButton

@Composable
fun QueriesGrid(
    buttons: List<MainPageRequestButton>,
    onButtonClick: (MainPageRequestButton) -> Unit,
) {
    val lazyGridState = rememberLazyGridState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        state = lazyGridState,
        modifier = Modifier.padding(30.dp)
    ) {
        itemsIndexed(buttons) { _, item ->
            QueriesGridItem(
                modifier = Modifier
                    .clickable {
                        onButtonClick(item)
                    },
                item = item
            )
        }
    }
}