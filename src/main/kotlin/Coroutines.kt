package com.eventloopsoftware

import kotlinx.coroutines.*
import kotlin.time.measureTime

fun main() = runBlocking {

    val res = nonBlocking()
    val res2 = res + 4

    println(res)

    val time = measureTime {
        val result1 = async { nonBlocking() }
        val result2 = async { nonBlocking() }
        println(result1.await() + result2.await())
    }

    println("Completed in $time ms")

}

suspend fun nonBlocking(): Int {
    delay(1000L)
    return 1
}