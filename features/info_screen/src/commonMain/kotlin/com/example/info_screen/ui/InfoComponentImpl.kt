package com.example.info_screen.ui

import com.arkivanov.decompose.ComponentContext

class InfoComponentImpl (
    val componentContext: ComponentContext,
) : ComponentContext by componentContext, InfoComponent {

}