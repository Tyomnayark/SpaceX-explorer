package com.example.main_screen.ui

import com.arkivanov.decompose.ComponentContext
import com.example.core_utils.componentCoroutineScope
import com.example.main_screen.models.MainPageRequestButton
import com.example.main_screen_domain.interfaces.GetRocketsBasicInfoUseCase
import com.example.main_screen_domain.interfaces.GetRocketsFullInfoUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class MainPageComponentImpl(
    val componentContext: ComponentContext,
    private val getRocketsFullInfoUseCase: GetRocketsFullInfoUseCase,
    private val getRocketsBasicInfoUseCase: GetRocketsBasicInfoUseCase,

    val onGetRequestFromServer: (List<com.example.main_screen_domain.models.RequestInfoList>) -> Unit,
) : ComponentContext by componentContext, MainPageComponent, KoinComponent {

    private val coroutineScope = componentCoroutineScope()

    override val isLoading: MutableStateFlow<Boolean> = MutableStateFlow(false)

    override val buttons: MutableStateFlow<List<MainPageRequestButton>> = MutableStateFlow(
        listOf(
            MainPageRequestButton.FULL_ROCKETS_INFO,
            MainPageRequestButton.BASIC_ROCKETS_INFO,
            MainPageRequestButton.USERS_AGGREGATE_INFO
        )
    )

    override fun onButtonClick(button: MainPageRequestButton) {
        coroutineScope.launch {
            isLoading.update {
                true
            }

            val response = when (button) {
                MainPageRequestButton.FULL_ROCKETS_INFO -> {
                    getRocketsFullInfoUseCase.execute()
                }

                MainPageRequestButton.BASIC_ROCKETS_INFO -> {
                    getRocketsBasicInfoUseCase.execute()
                }

                MainPageRequestButton.USERS_AGGREGATE_INFO -> {
                    listOf()
                }
            }
            onGetRequestFromServer(response)
            isLoading.update {
                false
            }
        }
    }
}
