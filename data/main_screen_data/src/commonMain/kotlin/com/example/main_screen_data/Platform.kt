package com.example.main_screen_data

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform