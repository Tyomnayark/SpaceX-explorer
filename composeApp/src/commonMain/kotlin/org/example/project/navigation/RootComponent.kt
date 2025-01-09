package org.example.project.navigation

import com.arkivanov.decompose.router.stack.ChildStack

import com.arkivanov.decompose.value.Value
import com.example.info_screen.ui.InfoComponent
import com.example.main_screen.ui.MainPageComponent
import com.example.settings.ui.SettingsComponent


interface RootComponent {
    val childStack: Value<ChildStack<*, Child>>

    sealed interface Child {
        class MainPage(val component: MainPageComponent) : Child
        class Settings(val component: SettingsComponent) : Child
        class Info(val component: InfoComponent) : Child
    }
}