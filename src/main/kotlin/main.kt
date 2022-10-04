package ru.netology

fun main() {
    val likes = 1
    val result = if (likes == 1 || likes == 101 || likes == 201) {
        "понравилось $likes-му человеку"
    } else "понравилось $likes людям"
    println(result)
}

