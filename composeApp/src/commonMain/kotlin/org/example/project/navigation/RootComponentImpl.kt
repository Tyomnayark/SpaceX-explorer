package org.example.project.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import kotlinx.serialization.Serializable
import com.arkivanov.decompose.router.stack.childStack
import com.example.info_screen.ui.InfoComponentImpl
import com.example.main_screen.ui.MainPageComponentImpl
import com.example.settings.ui.SettingsComponentImpl
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
                    componentContext,
                    get()
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
                    componentContext
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
        data object Info : ChildConfig
    }
}
