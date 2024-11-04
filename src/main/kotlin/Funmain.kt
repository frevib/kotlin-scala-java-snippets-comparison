package com.eventloopsoftware

fun main(): Unit {
    println("Hello DHL!")

    val number = 1

    var text = "some text ${number.toString()}"

    val obj = String(text.toCharArray())

    println(obj)
}

//Hello DHL!
//some text 1