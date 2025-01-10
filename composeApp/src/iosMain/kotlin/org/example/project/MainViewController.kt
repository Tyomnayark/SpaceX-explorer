package org.example.project

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.ApplicationLifecycle
import org.example.project.di.appModules
import org.example.project.navigation.RootComponentImpl
import org.example.project.navigation.RootContent
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController {
    val rootComponent = remember {
        RootComponentImpl(DefaultComponentContext(ApplicationLifecycle()))
    }
    RootContent(rootComponent)
}

 fun initKoin() {
    startKoin {
        modules(
            appModules
        )
    }
}
