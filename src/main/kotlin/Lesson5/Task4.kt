package Lesson5

fun main() {
    val login = "Batman"
    val pass = "password"

    print("input you login: ")
    if (readln() == login) {
        print("input password: ")
        if(readln() == pass) {
            println("welcome!!!")
        }
        else
            println("authorisation lose")
    }
    else
        println("register please")
}