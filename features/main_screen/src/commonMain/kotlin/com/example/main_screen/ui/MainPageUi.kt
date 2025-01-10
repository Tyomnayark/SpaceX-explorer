package com.example.main_screen.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.main_screen.ui.widgets.LoadingWidget
import com.example.main_screen.ui.widgets.QueriesGrid
import org.jetbrains.compose.resources.stringResource
import src.commonMain.composeResources.Res
import src.commonMain.composeResources.main_screen_subtitle
import src.commonMain.composeResources.main_screen_title

@Composable
fun MainPageUi(component: MainPageComponent) {

    val buttons = component.buttons.collectAsStateWithLifecycle()
    val isLoading = component.isLoading.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(Res.string.main_screen_title),
                modifier = Modifier
                    .padding(top = 10.dp),
                fontSize = 45.sp
            )
            Text(
                text = stringResource(Res.string.main_screen_subtitle),
                modifier = Modifier,
                fontSize = 25.sp
            )
            QueriesGrid(
                buttons = buttons.value,
                onButtonClick = component::onButtonClick
            )
        }
        if (isLoading.value){
            LoadingWidget()
        }
    }
}