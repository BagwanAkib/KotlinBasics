package com.akib.kotlinbasics.consoleexample.inheritance

class Nokia(
    screen: String,
    charging: Int,
    ram: Int,
    rom: Int
) : Mobile(screen, charging, ram, rom, true) {
    init {
        sms = true // assign value to direct parent class through init
    }

    override fun whatIsYourImplementation(): Boolean {
        TODO("Not yet implemented")
    }
}