package com.eventloopsoftware


fun main() {
    val intList: List<Int> = listOf(1, 2, 3, 4, 5)

    val result = intList
        .map { it + 2 }
        .filter { it % 2 == 0 }
        .flatMap { listOf(it, it) }
        .reduce { a, b -> a * b }

    println(result)

    val aap: List<String> = SomeCollection.someList.map { it + "32" }
    val str: String? = SomeCollection.someString + "__gfdds".toIntOrNull()
    val int1: Int? = SomeCollection.someInt?.inc()?.let { it * 2 }

    println(str)
    println("int1: ${int1}")
}