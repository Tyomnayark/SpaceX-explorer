package com.example.main_screen.ui

import com.example.main_screen.models.MainPageRequestButton
import kotlinx.coroutines.flow.MutableStateFlow

interface MainPageComponent {
    val buttons: MutableStateFlow<List<MainPageRequestButton>>
    val isLoading: MutableStateFlow<Boolean>

    fun onButtonClick(button: MainPageRequestButton)
}
