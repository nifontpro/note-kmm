package ru.nb.noteapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform