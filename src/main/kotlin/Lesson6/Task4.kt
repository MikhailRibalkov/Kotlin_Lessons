package Lesson6

import kotlin.random.Random

fun main() {
    val secrretNumber = Random.nextInt(1, 9)
    for (i in 1..5) {
        println("input number 1-9: ")
        val num = readln().toInt()
        if (num == secrretNumber) {
            println("you win")
            break
        }
        else {
            println("no, try again")
        }
    }
    println("было загадано число $secrretNumber")
}