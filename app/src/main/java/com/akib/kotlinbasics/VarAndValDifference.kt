package com.akib.kotlinbasics

fun VarAndValDifference(){
    var variableVar:String = "Value1"
    print("After declaration value of VAR is $variableVar")
    variableVar = "Value2"
    print("After changing value of VAR is $variableVar")


    val variableVal:String = "FIXED"
    print("After declaration value of VAL is $variableVal")
    // Val cannot be reassigned
    // variableVal = "CHANGE"

}