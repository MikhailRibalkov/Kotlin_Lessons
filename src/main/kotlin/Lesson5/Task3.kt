package Lesson5

fun main() {
    val secretNum1 = 3
    val secretNum2 = 5
    println("input first number: ")
    val firstNum = readln().toInt()
    println("input second number: ")
    val secondNum = readln().toInt()

    if(firstNum == secretNum1 && secondNum == secretNum2)
        println("you win")
    else if(secretNum1 == firstNum || secretNum2 == secondNum)
        println("you win consolatory prise")
    else
        println("you lose")
}