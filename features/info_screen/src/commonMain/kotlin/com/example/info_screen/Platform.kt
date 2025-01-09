package com.example.info_screen

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform