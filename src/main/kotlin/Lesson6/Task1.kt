package Lesson6

fun main() {
    val login = "user"
    val pass = "user"
    var success = false

    while(!success) {
        print("input login: ")
        val username = readLine()
        print("input password: ")
        val passwd = readLine()

        if(username == login && passwd == pass) {
            println("login success!")
            break
        }
        else {
            println("login fail, try again")
        }
    }
}