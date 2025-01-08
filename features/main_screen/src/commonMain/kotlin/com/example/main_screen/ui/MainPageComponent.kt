package com.example.main_screen.ui

import kotlinx.coroutines.flow.MutableStateFlow

interface MainPageComponent {
    val text: MutableStateFlow<String>

    fun onButtonClick()

    fun onSendRequest()
}
