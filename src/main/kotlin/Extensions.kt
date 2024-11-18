package com.eventloopsoftware

fun String.capitalizeFirstLetter(): String =
    if (this.isEmpty()) this else this.substring(0, 1).uppercase() + this.substring(1)

fun main() {
    val input = "hello, world!"
    val output = input.capitalizeFirstLetter()

    println(output) // Output: Hello, world!
}