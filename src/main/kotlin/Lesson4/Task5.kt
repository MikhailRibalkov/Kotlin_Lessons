package Lesson4

fun main() {
    println("input body damage (true/false): ")
    val bodyDamage = readLine()?.toBoolean()
    println("input team count: ")
    val teamCount = readLine()?.toInt()
    println("input provision count: ")
    val provisionCount = readLine()?.toInt()
    println("input weather condition (true/false): ")
    val weatherCondition = readLine()?.toBoolean()

    val onePermit = (!bodyDamage!! && teamCount in 55 until 70 && (provisionCount!! > 50)) || (bodyDamage!! && teamCount ==70 && (provisionCount!! > 50) && weatherCondition!!)

    println(onePermit)
}