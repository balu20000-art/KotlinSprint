package org.example.Lesson_2

import kotlin.math.floor

fun main() {
    val crystals = 7.0
    val iron = 11.0
    val buff = 20
    val buffCrystals = String.format("%.0f", crystals / PERCENTS * buff)
    val buffIron = String.format("%.0f", iron / PERCENTS * buff)
    println(
        """
         Buff of Crystals : $buffCrystals
         Buff of Iron : $buffIron
    """.trimIndent()
    )
}

const val PERCENTS = 100
