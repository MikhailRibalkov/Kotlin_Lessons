package Lesson6

import java.util.Timer

fun main() {
    print("input time: ")
    val seconds = readln().toInt()
    for (i in 1 .. seconds) {
        Thread.sleep(1000)
    }
    println("прошло $seconds секунд ...")
}