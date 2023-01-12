package Lesson1

import kotlin.math.min

fun main(){
    val seconds: Int = 6480
    val minutes = seconds/60
    println("time: $minutes:${seconds%60}")
}