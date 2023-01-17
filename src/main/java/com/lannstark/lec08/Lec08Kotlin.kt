package com.lannstark.lec08

fun main3(){
    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers) {
        println(number)
    }
}

fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}

fun main2() {
    for(i in 1..3) {
        println(i)
    }

    for( i in 3 downTo 1) {
        println(i)
    }

    for(i in 1..5 step 2) {
        println(i)
    }
}

//리턴 값이 expression일 경우 중괄호 없애고 return으로 줄 수 있다.
//public 생략 가능함.
fun max(a: Int, b: Int) = if(a > b) a else b

fun repeat(str: String, num: Int = 3, userNewLine: Boolean = true) {
    for(i in 1..num) {
        if(userNewLine) {
            println(str)
        } else
            print(str)
    }
}

fun main() {
    repeat("Helloworld",20, userNewLine = false)
}