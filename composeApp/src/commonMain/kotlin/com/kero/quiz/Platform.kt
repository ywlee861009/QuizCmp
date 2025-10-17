package com.kero.quiz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform