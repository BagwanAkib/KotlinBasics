package com.akib.kotlinbasics.consoleexample.inheritance

abstract class Mobile(
    var screen: String,
    var charging: Int,
    var ram: Int,
    var rom: Int,
    var call: Boolean,
    var sms: Boolean = true
) : MobileInterface {

    override fun chargingStatus(): Int {
        return charging
    }

    override fun toString(): String {
        return "screen='$screen', call='${if (call) "Yes" else "NO"}', sms='${if (sms) "Yes" else "NO"}', charging=$charging, ram='$ram', rom='$rom' "
    }

    abstract fun whatIsYourImplementation(): Boolean

}