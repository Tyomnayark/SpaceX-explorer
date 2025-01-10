package com.example.info_screen.ui

import com.example.main_screen_domain.models.RequestInfoList
import kotlinx.coroutines.flow.MutableStateFlow

interface InfoComponent {
    val info: MutableStateFlow<List<RequestInfoList>>
    val onClickBackButton: () -> Unit
}