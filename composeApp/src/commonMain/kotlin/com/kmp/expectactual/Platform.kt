package com.kmp.expectactual

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform