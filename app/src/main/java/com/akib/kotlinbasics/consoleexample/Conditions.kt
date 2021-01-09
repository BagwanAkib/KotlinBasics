package com.akib.kotlinbasics.consoleexample

fun main() {
    //IF statement
    var people = 110;
    if (people >= 100) {
        println("People is greater then 100 ie. $people")
    }
    //OUTPUT: People is greater then 100 ie. 110

    // IF ELSE
    people -= 50
    if (people >= 100) {
        println("People is greater then 100 ie. $people")
    } else {
        println("People is less then 100 ie. $people")
    }
    //OUTPUT: People is less then 100 ie. 60

    // below is example of while you like to assign value from 2 or 3 conditions but if more then 3 then go with when <- switch
    val output =
        if (people >= 100) {
            "People is greater then 100 ie. $people"
        } else {
            "People is less then 100 ie. $people"
        }
    println(output)


    // WHEN work like switch
    people = 100
    when (people) {
        100 -> println("people count is 100")
        in 100..200 -> println("people count is in between 100 to 200")
    }
    people = 150
    when (people) {
        100 -> println("people count is 100")
        in 200 downTo 100 -> println("people count is in between 200 to 100")
    }
}
