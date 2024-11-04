package com.eventloopsoftware

fun main() {
//    var abc: String? = "aaabc"
    var number: Int? = 42
    var abc: String? = null

    val result = abc?.length
    val result2 = abc?.let { "${it}_DHL" }?.length
    val result3 = number?.let { it + 10 }?.toString()

//    val result = abc?.map { it.inc() }?.filter { it == 'b' }?.joinToString()

    println(result2)
    println(result3)
}