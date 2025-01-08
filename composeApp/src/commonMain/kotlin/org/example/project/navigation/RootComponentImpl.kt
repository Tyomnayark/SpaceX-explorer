package org.example.project.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import kotlinx.serialization.Serializable
import com.arkivanov.decompose.router.stack.childStack
import com.example.main_screen.ui.MainPageComponentImpl
import com.example.settings.ui.SettingsComponentImpl


class RootComponentImpl(
    componentContext: ComponentContext,
) : ComponentContext by componentContext, RootComponent {

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
                    componentContext
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
    }

    @Serializable
    sealed interface ChildConfig {

        @Serializable
        data object MainPage : ChildConfig

        @Serializable
        data class Settings(val employeeId: Int) : ChildConfig
    }
}