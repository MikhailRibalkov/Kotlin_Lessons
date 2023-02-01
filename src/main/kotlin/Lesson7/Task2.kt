package Lesson7

import kotlin.random.Random

fun main() {
    while (true) {
        val cod = Random.nextInt(1000,10000)
        println("You authorisation code: $cod")
        print("input you authorisation code: ")

        if(cod != readln().toInt()) {
            continue
        }
        else {
            println("Welcome!!!")
            break
        }
    }


}