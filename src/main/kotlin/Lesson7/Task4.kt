package Lesson7

fun main() {
    print("input seconds count: ")
    val scount = readln().toInt()

    for(i in scount downTo 1) {
        println("time left: $i seconds...")
        Thread.sleep(1000)
    }
    println("time is over!")
}