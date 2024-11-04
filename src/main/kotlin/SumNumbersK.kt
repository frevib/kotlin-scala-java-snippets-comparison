package com.eventloopsoftware

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val a = a()
    val numberList: List<Int>? = listOf(1, 2, 3, 4, 5)

    val sum = numberList?.sum()?.let { it -> it.inc() }

    println("The sum of the numbers is: $sum")
}

private suspend fun a() = delay(1000L)