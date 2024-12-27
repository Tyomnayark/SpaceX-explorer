package com.tyom.feature_main

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform