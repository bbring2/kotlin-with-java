package com.lannstark.lec09

import java.time.Period

fun main() {
}
class Person(name: String = "쁘링이", var age: Int) {
    init { //초기화 블록
        if(age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없습니다.")
        }

        println("이건 초기화블록!")
    }

    val name = name
        get() {
            return field.uppercase()
        }

    constructor(name: String): this(name, 1) { //다른 생성자를 호출하는거임 원래있던거
        println("첫번째 부생성자")
    }

    constructor(): this("길동") {
        println("두번째 부생성자")
    }

    fun isAdult1(): Boolean {
        return this.age >= 20
    }

    //custom getter
    val isAdult2: Boolean
        get() = this.age >= 20

    val isAdult3: Boolean
        get() {
            return this.age >= 20
        }
}