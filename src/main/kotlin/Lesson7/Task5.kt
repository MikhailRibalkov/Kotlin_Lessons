package Lesson7

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val lowCar = 'a'..'z'
    val capCar = 'A'..'Z'
    val integers = 0..9
    val cars = lowCar + capCar + integers
    var cifer = ""
    print("input length of password: ")
    val length = readln().toInt()
    for(i in 0..length) {
        cifer += cars[Random.nextInt(0 until  cars.size)]
    }
    println(cifer)
}