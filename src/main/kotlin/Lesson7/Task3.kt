package Lesson7

fun main() {
    print("Input a number: ")
    val num = readln().toInt()
    for( i in 0..num step 2 )
        println(i)
}