package com.example.main_screen

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform