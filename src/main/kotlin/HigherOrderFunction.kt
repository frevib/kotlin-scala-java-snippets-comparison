package com.eventloopsoftware

fun main() {
    val square: (Int) -> Int = { x -> x * x }
    val addOne: (Int) -> Int = { x -> x + 1 }

    val squareThenAddOne = combineFunctions(square, addOne)

    val result = squareThenAddOne(4)

    println(result) // Output: 17
}

fun combineFunctions(f1: (Int) -> Int, f2: (Int) -> Int): (Int) -> Int =
    { x -> f1(x).let(f2) }
