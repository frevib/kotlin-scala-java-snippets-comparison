package com.eventloopsoftware

fun main() {
    val person = Person("Donald Trump", 78)

    println(person.age) // Output: 78

    val list = Interoptability.getList()

    println(list.joinToString(", ")) // Output: Java, Kotlin, Scala
}