package com.example.settings_domain

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform