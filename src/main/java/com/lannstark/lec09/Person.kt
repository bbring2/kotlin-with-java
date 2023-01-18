package com.lannstark.lec09

fun main() {
    val person = JavaPerson("최희정", 29)
    println(person.name) //이건 게터고
    person.age = 10 //세터임

    println(person.age)
}
class Person(val name: String, var age: Int)