package com.example.settings_data

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform