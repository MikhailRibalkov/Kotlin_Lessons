package Lesson8

fun main() {
    val ingridients = arrayOf("eggs", "solt", "chees", "pepper")

    print("Input ingridient to find: ")
    var ingridient = readln()

    if (ingridient in ingridients) {
        println("ingridient ${ingridient} is there")
    }
    else
        println("no such ingridient")
}