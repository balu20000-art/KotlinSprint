package org.example.Lesson_2

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39
    val minuteOnWay = 457
    val hourArrival = String.format(
        "%02d",
        (hourDeparture * SEKOND_IN_MINUTE_IN_HOUR + minuteDeparture + minuteOnWay) / SEKOND_IN_MINUTE_IN_HOUR
    )
    val minuteArrival = String.format(
        "%02d",
        (hourDeparture * SEKOND_IN_MINUTE_IN_HOUR + minuteDeparture + minuteOnWay) % SEKOND_IN_MINUTE_IN_HOUR
    )
    println("$hourArrival:$minuteArrival")
}

const val SEKOND_IN_MINUTE_IN_HOUR = 60