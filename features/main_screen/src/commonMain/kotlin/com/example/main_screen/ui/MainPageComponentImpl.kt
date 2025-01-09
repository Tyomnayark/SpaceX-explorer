package com.example.main_screen.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.essenty.lifecycle.Lifecycle
import com.arkivanov.essenty.lifecycle.doOnDestroy
import com.example.core_utils.componentCoroutineScope
import com.example.main_screen.models.MainPageRequestButton
import com.example.main_screen_domain.interfaces.GetRocketsFullInfoUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.get

class MainPageComponentImpl(
    val componentContext: ComponentContext,
    private val getRocketsFullInfoUseCase: GetRocketsFullInfoUseCase
) : ComponentContext by componentContext, MainPageComponent, KoinComponent {

    private val coroutineScope = componentCoroutineScope()

    override val text = MutableStateFlow("") //удалить!!

    override val buttons: MutableStateFlow<List<MainPageRequestButton>> = MutableStateFlow(
        listOf(
            MainPageRequestButton.FULL_ROCKETS_INFO,
            MainPageRequestButton.BASIC_ROCKETS_INFO
        )
    )

    override fun onButtonClick(button: MainPageRequestButton) {
        coroutineScope.launch {
            val response = when (button) {
                MainPageRequestButton.FULL_ROCKETS_INFO -> {
                    getRocketsFullInfoUseCase.execute()
                }

                MainPageRequestButton.BASIC_ROCKETS_INFO -> {
                    listOf()
                }
            }
            text.update { response.toString() }
        }
    }
}
