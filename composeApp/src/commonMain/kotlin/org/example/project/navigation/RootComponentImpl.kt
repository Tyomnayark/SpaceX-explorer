package org.example.project.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.navigate
import com.arkivanov.decompose.router.stack.push
import com.example.info_screen.ui.InfoComponentImpl
import com.example.main_screen.ui.MainPageComponentImpl
import com.example.main_screen_domain.models.RequestInfoList
import com.example.settings.ui.SettingsComponentImpl
import kotlinx.serialization.Serializable
import org.koin.core.component.KoinComponent
import org.koin.core.component.get


class RootComponentImpl(
    componentContext: ComponentContext,
) : ComponentContext by componentContext, RootComponent, KoinComponent {

    private val navigation = StackNavigation<ChildConfig>()

    override val childStack = childStack(
        source = navigation,
        initialConfiguration = ChildConfig.MainPage,
        serializer = ChildConfig.serializer(),
        handleBackButton = true,
        childFactory = ::createChild
    )

    private fun createChild(
        config: ChildConfig,
        componentContext: ComponentContext
    ): RootComponent.Child = when (config) {

        is ChildConfig.MainPage -> {
            RootComponent.Child.MainPage(
                MainPageComponentImpl(
                    componentContext = componentContext,
                    getRocketsFullInfoUseCase = get(),
                    getRocketsBasicInfoUseCase = get(),
                    onGetRequestFromServer = { info ->
                        navigation.push(ChildConfig.Info(info))
                    }
                )
            )
        }

        is ChildConfig.Settings -> {
            RootComponent.Child.Settings(
                SettingsComponentImpl(
                    componentContext
                )
            )
        }

        is ChildConfig.Info -> {
            RootComponent.Child.Info(
                InfoComponentImpl(
                    componentContext,
                    infoList = config.infoList,
                    onClickBackButton = {
                        navigation.navigate { stack ->
                            if (stack.isNotEmpty()) stack.dropLast(1) else stack
                        }
                    }
                )
            )
        }
    }

    @Serializable
    sealed interface ChildConfig {

        @Serializable
        data object MainPage : ChildConfig

        @Serializable
        data object Settings : ChildConfig

        @Serializable
        data class Info(val infoList: List<RequestInfoList>) : ChildConfig
    }
}
