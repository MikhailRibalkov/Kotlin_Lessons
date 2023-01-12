package Lesson4

fun main() {
    val adjectiveWeather = "sunny"
    val adjectiveTentCondition = "open"
    val adjectiveHumidity = 20
    val notAdjectiveSeason = "winter"

    val weather = "sunny"
    val tentCondition = "open"
    val humidity = 20
    val season = "winter"

    println("${weather == adjectiveWeather && tentCondition == adjectiveTentCondition && humidity == adjectiveHumidity && season != notAdjectiveSeason}")
}