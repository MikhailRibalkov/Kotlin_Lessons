package Lesson2

fun main() {
    val hours = 9
    val minutes = 39
    val timeOfWay = 457

    val finishHours = ((hours * 60)+timeOfWay + minutes)/60
    val finishMinutes = ((hours * 60)+timeOfWay + minutes)%60

    println("Finish time: $finishHours:$finishMinutes")
}