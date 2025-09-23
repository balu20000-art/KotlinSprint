package org.example.Lesson_1

fun main() {

    val secondsAll = 6480
    var secondsOfFlight = String.format("%02d", secondsAll % SEKOND_IN_MINUTE_IN_HOUR)
    val minuteOfFlight = String.format("%02d", secondsAll / SEKOND_IN_MINUTE_IN_HOUR % SEKOND_IN_MINUTE_IN_HOUR)
    val hourOfFlight = String.format("%02d", secondsAll / SEKOND_IN_MINUTE_IN_HOUR / SEKOND_IN_MINUTE_IN_HOUR)
    println("$hourOfFlight:$minuteOfFlight:$secondsOfFlight")
}

const val SEKOND_IN_MINUTE_IN_HOUR = 60