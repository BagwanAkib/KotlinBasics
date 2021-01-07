package com.akib.kotlinbasics

fun main(strarg: Array<String>){
    var str:String = "World"
    val price:Int = 400

    //Using $ + variable name
    println("Hello $str")
    println("Gift price is "+ price)

    // to use dollar along with variable use double dollar $$
    println("I purchased gift for friend for $$price")

    //None of the following functions can be called with the arguments supplied
    // str = price + " is too high" //< this will not work because kotlin only accept string start with character set
    // str = "$price  is too high" //< you can use this way because we put variable in double quotes
}