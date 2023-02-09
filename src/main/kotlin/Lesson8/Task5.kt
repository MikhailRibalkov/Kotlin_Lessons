package Lesson8

fun main() {
    var ingridients = arrayOf("")
    print("how much ingridients you want to add: ")
    val num = readln().toInt()

    for (i in 0 until  num) {
        print("input ingridient: ")
        var ingridient = readln()
        if (i == 0) ingridients[i] = ingridient
        else ingridients += ingridient
    }
    println("list of ingridients: ${ingridients.contentToString()}")

}