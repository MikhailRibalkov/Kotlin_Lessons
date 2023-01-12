package Lesson2

fun main() {
    var employerCount = 50
    var traineeCount = 30
    var employerSalary = 30000
    val traineeSalary = 20000
    var totalEmployerSalary = employerSalary * employerCount
    var totalSalary = employerSalary * employerCount + traineeSalary * traineeCount
    var averageSalary = (employerSalary + traineeSalary) / 2

    println("Total salary of employers: $totalEmployerSalary")
    println("Total salary of all: $totalSalary")
    println("Average salary: $averageSalary")

}