package com.akib.kotlinbasics.consoleexample

fun main() {
    val salary: Int = 40000
    var increment: Double = 10.0
    print("Raj and Joy is earning monthly $salary")
    println(" Now Raj got $increment% of increment. now he is earning ${salary + (salary * (increment / 100))}")
    increment = 2.7
    println(
        "But Joy got $increment% of increment and now he is earning ${getIncrementedSalary(
            salary,
            increment
        )}"
    )
}

fun getIncrementedSalary(salary: Int, increment: Double): Double {
    return salary + (salary * (increment / 100))
}

/*
* Output
* Raj and Joy is earning monthly 40000 Now Raj got 10.0% of increment. now he is earning 44000.0
* But Joy got 2.7% of increment and now he is earning 41080.0
* */