package Lesson2

import kotlin.math.roundToInt

fun main() {
    val iron_ore = 11
    val cristal_ore = 7
    val iron_buf = (iron_ore*0.2).roundToInt()
    val cristal_buf = (cristal_ore*0.2).roundToInt()
    println("cristal ore: $cristal_buf")
    println("iron ore: $iron_buf")
}