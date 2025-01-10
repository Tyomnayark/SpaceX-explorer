package com.example.info_screen.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.info_screen.ui.widgets.BasicRocketInfoItem
import com.example.info_screen.ui.widgets.FullRocketInfoItem
import com.example.main_screen_domain.models.RequestInfoList

@Composable
fun InfoUi(component: InfoComponent) {

    val listInfo: State<List<RequestInfoList>> = component.info.collectAsStateWithLifecycle()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = null,
            modifier = Modifier
                .padding( 15.dp)
                .height(35.dp)
                .clickable {
                    component.onClickBackButton()
                },
            contentScale = ContentScale.FillHeight
        )

        when (listInfo.value.firstOrNull()) {
            is RequestInfoList.RocketBasicInfoList -> {
                LazyColumn(
                    modifier = Modifier
                        .padding(15.dp)
                ) {
                    itemsIndexed(listInfo.value) { _, item ->
                        val basicRocketInfo = item as? RequestInfoList.RocketBasicInfoList
                        basicRocketInfo?.let {
                            BasicRocketInfoItem(basicInfo = it)
                        }
                    }
                    item {
                        Spacer(modifier = Modifier.height(50.dp))
                    }
                }
            }

            is RequestInfoList.RocketFullInfoList -> {
                LazyColumn(
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                ) {
                    itemsIndexed(listInfo.value) { _, item ->
                        val fullRocketInfo = item as? RequestInfoList.RocketFullInfoList
                        fullRocketInfo?.let {
                            FullRocketInfoItem(info = it)
                        }
                    }
                    item {
                        Spacer(modifier = Modifier.height(50.dp))
                    }
                }
            }

            else -> {

            }
        }
    }
}
