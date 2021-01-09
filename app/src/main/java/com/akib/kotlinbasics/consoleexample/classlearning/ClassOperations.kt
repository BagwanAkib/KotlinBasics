package com.akib.kotlinbasics.consoleexample.classlearning

fun main(arg: Array<String>) {
    val anil =
        Player("Anil Sharma");

    println("Below is data from ${anil.name} Class Object \n $anil")


    // Object Clone we can update anything in cloned class object it will reflect in all
    val akib = anil
    akib.name = "Akib"
    println("name: [Akib]> ${akib.name}  & [Anil]> ${anil.name}  ")

    // Value Passing - still same
    val kunal1: Player = akib.clone();
    kunal1.name = "Kunal"
    println("name: [kunal]> ${kunal1.name}  & [akib]> ${akib.name}  ")

    // Value Passing
    val kunal: Player =
        Player()
    kunal.copy(akib)
    kunal.name = "Kunal"
    println("name: [kunal]> ${kunal.name}  & [akib]> ${akib.name}  ")

}