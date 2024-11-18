package com.eventloopsoftware


fun main() {
    val list: List<Int> = (1..5).toList()

    val result = list
        .map { it + 2 }
        .filter { it % 2 == 0 }
        .flatMap { listOf(it, it) }
        .reduce { a, b -> a * b }

    println(result) // Output: 576

    val sum = list.sum()

    println(sum) // Output: 15
}