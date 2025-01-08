package com.example.main_screen.ui

import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import org.koin.core.component.KoinComponent

class MainPageComponentImpl(
    val componentContext: ComponentContext
) : ComponentContext by componentContext, MainPageComponent, KoinComponent {

    override val text = MutableStateFlow("")

    override fun onButtonClick() {
        text.update { "button clicked" }
    }

    override fun onSendRequest() {

    }
}