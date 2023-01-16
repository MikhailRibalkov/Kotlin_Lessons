package Lesson5

import kotlin.random.Random

fun main() {
    for (i in 1..3) {
        val firstNum = Random.nextInt(1, 9)
        val lastNum = Random.nextInt(1, 9)
        print("are you not bot? how much $firstNum + $lastNum? ")
        val answer = readln().toInt()
        if (firstNum + lastNum == answer) {
            println("Добро пожаловать")
            return
        }
    }
    println("access denied")
}