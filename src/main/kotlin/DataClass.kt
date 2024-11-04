package com.eventloopsoftware

class Person(val name: String, val age: Int)

data class PersonData(val name: String, val age: Int)

val person = PersonData(
    name = "Alice",
    age = 29
)

val name = person.component1()
