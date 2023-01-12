package Lesson4

import kotlin.math.max

fun main() {
    val minAverageWeight = 35
    val maxAverageWeight = 100
    val maxAverageVolume = 100

    val weight1 = 20
    val volume1 = 80
    val weight2 = 50
    val volume2 = 100

    println("${weight1 in minAverageWeight..maxAverageWeight && volume1 < maxAverageVolume}")
    println("${weight2 in minAverageWeight..maxAverageWeight && volume2 < maxAverageVolume}")
}