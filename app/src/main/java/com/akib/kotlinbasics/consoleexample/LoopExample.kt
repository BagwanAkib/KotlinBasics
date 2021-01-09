package com.akib.kotlinbasics.consoleexample

fun main() {
    print("1 to 10 using 1..10 > ")
    for (i in 1..10) {
        print(" $i")
    }
    println()
    print("1 to 10 using 1 until 10 > ")
    for (i in 1 until 10) {
        print(" $i")
    }
    println()
    print("1 to 10 using 1 downTo 10 > ")
    for (i in 10 downTo 0) {
        print(" $i")
    }

    /*
    * FOR LOOP
    * 1 to 10 using 1..10 >  1 2 3 4 5 6 7 8 9 10
    * 1 to 10 using 1 until 10 >  1 2 3 4 5 6 7 8 9
    * 1 to 10 using 1 downTo 10 >  10 9 8 7 6 5 4 3 2 1 0
    * */

    // For Loop with step
    println()
    print("1 to 10 using 1 until 10 step 2 > ")
    for (i in 1 until 10 step 2) {
        print(" $i")
    }
    /*
    * Step will add i + (step value)
    * 1 to 10 using 1 until 10 step 2 >  1 3 5 7 9
    * */
    println()
    var a = 10
    print("While > ")
    while (a > 0) {
        print(" $a")
        a--
    }
    println()
    print("do While > ")
    do {
        print(" $a")
        a++
    } while (a < 10)
}