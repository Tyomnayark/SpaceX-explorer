package com.example.features

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform