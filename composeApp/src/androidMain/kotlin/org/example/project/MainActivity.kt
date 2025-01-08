package org.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.defaultComponentContext
import org.example.project.navigation.RootComponentImpl
import org.example.project.navigation.RootContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root =
            RootComponentImpl(
                componentContext = defaultComponentContext(),
            )
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                RootContent(root)
            }
        }
    }
}