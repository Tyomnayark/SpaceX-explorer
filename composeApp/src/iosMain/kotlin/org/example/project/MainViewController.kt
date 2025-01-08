package org.example.project

import androidx.compose.ui.window.ComposeUIViewController
import org.example.project.navigation.RootComponentImpl
import org.example.project.navigation.RootContent
import org.koin.core.context.startKoin
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import com.arkivanov.decompose.DefaultComponentContext
import org.example.project.di.appModules

fun MainViewController() = ComposeUIViewController {
    val lifecycle = LifecycleRegistry()
    val componentContext = DefaultComponentContext(lifecycle)
    val root = RootComponentImpl(
        componentContext = componentContext
    )
    RootContent(root)
}


private fun initKoin() {
    startKoin {
        modules(
            appModules
        )
    }
}
