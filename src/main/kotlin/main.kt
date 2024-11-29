package ru.netology

import kotlin.math.roundToInt

fun main() {
    var amount = 15000
    val userStatus = true

    if (amount > 1000 && amount <= 10_000) {
        amount -= 100
    } else if (amount > 10_000) {
        amount = (amount * 0.95).toInt()
    }

    if (userStatus) {
        amount = (amount * 0.99).roundToInt()
    }

    println(amount)
}