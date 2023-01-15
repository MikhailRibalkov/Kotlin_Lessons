package Lesson6

fun main() {
    print("input time: ")
    val seconds = readln().toInt()
    for (i in 1 .. seconds) {
        Thread.sleep(1000)
        println("осталось секунд: ${seconds - i}")
    }
    println("Time went out")
}