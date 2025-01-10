package com.example.info_screen.ui

import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.flow.MutableStateFlow

class InfoComponentImpl(
    val componentContext: ComponentContext,
    val infoList: List<com.example.main_screen_domain.models.RequestInfoList>,

    override val onClickBackButton: () -> Unit
) : ComponentContext by componentContext, InfoComponent {
    override val info: MutableStateFlow<List<com.example.main_screen_domain.models.RequestInfoList>> = MutableStateFlow(infoList)

}