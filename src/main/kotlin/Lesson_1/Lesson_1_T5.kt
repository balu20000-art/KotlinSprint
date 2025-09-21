package org.example.Lesson_1

fun main() {

    val secondsAll = 6480
    val secondsOfFlight = secondsAll % 60
    val minuteOfFlight = secondsAll / 60 % 60
    val hourOfFlight = secondsAll / 60 / 60
    println("0$hourOfFlight:$minuteOfFlight:0$secondsOfFlight")

}