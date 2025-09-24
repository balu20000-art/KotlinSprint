package org.example.Lesson_2

fun main() {
    val worker = 50
    val workerSalary = 30000
    val intern = 30
    val internSalary = 20000
    val allWorkerSalary = worker * workerSalary
    val allSalary = allWorkerSalary + intern * internSalary
    val averageSalary = allSalary / (worker+intern)
    println(allWorkerSalary)
    println(allSalary)
    println(averageSalary)
}