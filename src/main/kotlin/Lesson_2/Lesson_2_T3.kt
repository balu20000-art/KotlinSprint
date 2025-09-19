package org.example.Lesson_2

fun main() {
    val departureHour : Int = 9
    val departureMinute : Int = 39
    val minutesOnTheWay : Int = 457
    val arrivalHour = (departureHour*60 + departureMinute + minutesOnTheWay)/60
    val arrivalMinute = (departureHour*60 + departureMinute + minutesOnTheWay)%60
       println("$arrivalHour:$arrivalMinute")
}