package org.example.Lesson_2

fun main() {
    val numberOfWorker = 50
    val workerSalari = 30000
    val numberOfIntern = 30
    val internSalari = 20000
    val allWorkersalari = numberOfWorker*workerSalari
    val allSalari = allWorkersalari + numberOfIntern*internSalari
    val averageSalari = allSalari / (numberOfWorker+numberOfWorker)
      println(allWorkersalari)
      println(allSalari)
      println(averageSalari)
}