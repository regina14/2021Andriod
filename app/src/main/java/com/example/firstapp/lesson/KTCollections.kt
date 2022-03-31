package com.example.firstapp.lesson

import org.json.JSONObject

fun main() {
    val array1:Array<Int> = arrayOf(1, 2, 3)
    val array2: Array<Any> = arrayOf(1, true, "2", JSONObject())

    val arrayOfNulls = arrayOfNulls<String>(5)
    arrayOfNulls[0] = "a"
    val asc= Array(5){i: Int ->(i * i).toString()}
    val bytes = ByteArray(5)
    bytes[0] = 1
}