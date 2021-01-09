package com.akib.kotlinbasics.consoleexample.classlearning

class Player() {
    var age: Int = 15
    var matches: Int = 0
    var name: String = ""

    constructor(name: String) : this() {
        this.name = name
    }

    override fun toString(): String {
        return " $name he is $age old and played $matches matches."
    }

    fun copy(obj: Player) {
        this.name = obj.name
        this.matches = obj.matches
        this.age = obj.age
    }

    fun clone(): Player {
        return this
    }
}