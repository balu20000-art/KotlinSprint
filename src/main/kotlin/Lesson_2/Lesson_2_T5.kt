package org.example.Lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val amountOfInterest = 16.7
    val depositPeriod = 20
    val depositInEnd = String.format("%.3f", deposit * (1 + amountOfInterest / 100).pow(depositPeriod))
    println("Your deposit after $depositPeriod years : $depositInEnd dollars")

}