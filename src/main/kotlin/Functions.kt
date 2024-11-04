package com.eventloopsoftware

fun function1(function2: (Int) -> Int) = function2(3)

fun main() {
    val lambda = { number: Int -> number * 2 }

    val res = function1(lambda)

    println(res)
}

// 6

