package com.example.firstapp.lesson

import org.json.JSONObject

fun main() {
    //1. declare a datatype
    //default data type is int, if exceed int range,
    val number = 100 //editor
    val number2:Int = 121
    val bigNumber = 80000000000
    val longNumber = 20L
    val byteNumber:Byte = 1

    // default: Double
    //float only keep 6 digits after point
    val doubleNumber = 3.12345678
    val floatNumber = 3.12345678F
    println("floatNumber: " + floatNumber)
    println("doubleNumber: " + doubleNumber)

    //char
    var char:Char = '0'
    var isVisiable: Boolean = false
    var str:String = "abcd"
    var str2 = str[1]
    println("This number is $number")
    println("str length is ${str.length}")
    val helloword3 = "{\"key\":\"value\"}"
    number.toDouble()
    val numberDou: Double = 3 / 2.toDouble()
    println(numberDou)
    val vip = true
    val admin = false
    val result:Boolean = vip.and(admin)
    val result2:Boolean = vip.or(admin)



}