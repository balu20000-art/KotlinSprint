package org.example.Lesson_2

fun main() {
    val totalPerson = 4
    val score_1 = 3.0
    val score_2 = 4.0
    val score_3 = 3.0
    val score_4 = 5.0
    val averageScore = (score_1 + score_2 + score_3 + score_4) / totalPerson
    println(String.format("%.2f", averageScore))

}