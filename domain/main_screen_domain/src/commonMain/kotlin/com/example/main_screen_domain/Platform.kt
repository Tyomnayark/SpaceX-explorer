package com.example.main_screen_domain

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform