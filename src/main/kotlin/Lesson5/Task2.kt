package Lesson5

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.Year
import java.util.Date

fun main() {
    val limitAge = 18
    val actualYear = SimpleDateFormat("yyyy").format(Date()).toInt()

    print("input your birsday year: ")
    val year = readln().toInt()

    if (actualYear - year < limitAge) {
        println("show limited content")
    }
    else
        println("show hidden content")
}