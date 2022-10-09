package ru.netology

fun main() {
    val likes = 100
    val result = if (likes == 1 || likes % 10 == 1) {
        "понравилось $likes-му человеку"
    } else "понравилось $likes людям"
    println(result)
}

