package org.example.project.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.stack.Children
import com.arkivanov.decompose.extensions.compose.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.stack.animation.stackAnimation
import com.example.info_screen.ui.InfoUi
import com.example.main_screen.ui.MainPageUi
import com.example.settings.ui.SettingsUI

@Composable
fun RootContent(component: RootComponent, modifier: Modifier = Modifier) {
    Children(
        stack = component.childStack,
        modifier = modifier,
        animation = stackAnimation(fade()),
    ) {
        when (val child = it.instance) {
            is RootComponent.Child.MainPage -> MainPageUi(component = child.component)
            is RootComponent.Child.Settings -> SettingsUI(component = child.component)
            is RootComponent.Child.Info -> InfoUi(component = child.component)
        }
    }
}