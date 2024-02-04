package com.makysis.kmmlibrarytest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform