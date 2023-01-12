package Lesson3

fun main() {
    val data = "D2-D4;0"
    val parseData = data.split("-", ";")
    println("from ${parseData[0]} to ${parseData[1]}; step ${parseData[2]}")
}