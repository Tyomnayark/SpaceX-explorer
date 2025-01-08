package com.example.core_network

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform