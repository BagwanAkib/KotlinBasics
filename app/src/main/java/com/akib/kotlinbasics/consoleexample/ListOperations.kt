package com.akib.kotlinbasics.consoleexample

import com.akib.kotlinbasics.consoleexample.classlearning.Player

fun main() {
    //Create List
    val playerList = ArrayList<Player>()

    playerList.add(Player("Kunal"))
    playerList.add(Player("Anil"))
    playerList.add(Player("Subhash"))

    for (player in playerList) {
        println(player)
    }
}