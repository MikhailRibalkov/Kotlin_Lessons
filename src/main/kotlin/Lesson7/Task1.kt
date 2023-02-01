package Lesson7

import kotlin.random.Random

fun main() {
    val simbols = "abcdefghijklmnopqrstuvwxyz1234567890".toList()
    var pass = ""
    for(i in 0..7) {
        pass += simbols[Random.nextInt(0, simbols.size)]
    }
    println(pass)
}