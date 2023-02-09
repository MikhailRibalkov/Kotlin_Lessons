package Lesson8

fun main() {
    val ingridients = arrayOf("eggs", "solt", "chees", "pepper")
    println("ingridients list:")
    for (i in ingridients) {
        print("${i}, ")
        println("")
    }
    print("what you want to replase? ")
    var ingridient = readln()
    if (ingridient !in ingridients) {
        println("ingridient not found")
    }
    else {
        print("input ingridient to add instead of ${ingridient}: ")
        val newIngridient = readln()
        ingridients[ingridients.indexOf(ingridient)] = newIngridient
        println("ingridients list:")
        for (i in ingridients) {
            print("${i}, ")
        }
    }
}