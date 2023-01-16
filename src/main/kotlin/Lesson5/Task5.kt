package Lesson5

import kotlin.random.Random

fun main() {
    val num1 = Random.nextInt(1, 101)
    val num2 = Random.nextInt(1, 101)

    println("input first number: ")
    val firstNum = readln().toInt()
    println("input second number: ")
    val secondNum = readln().toInt()

    if(firstNum == num1 && secondNum == num2)
        println("you win")
    else if(num1 == firstNum || num2 == secondNum)
        println("you win consolatory prise")
    else
        println("you lose")

    println("secret numbers: $num1, $num2")
}