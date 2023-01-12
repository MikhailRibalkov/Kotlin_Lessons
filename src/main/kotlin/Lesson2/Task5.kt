package Lesson2

import kotlin.math.pow

fun main() {
    val v = 70000
    val p = 16.7
    val n = 20

    val coefficient = 1 + p / 100
    var final_sum = v * coefficient.pow(n)
    println("${"%.3f".format(final_sum)}")
}