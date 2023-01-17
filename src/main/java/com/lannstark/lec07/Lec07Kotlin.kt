package com.lannstark.lec07

import kotlin.NumberFormatException

fun parseIntOrThrow(str: String):Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 문자 ${str}는 숫자가 아닙니다.")
    }
}

fun parseInOrThrow(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    } //하나의 expression 으로 간주됨
}