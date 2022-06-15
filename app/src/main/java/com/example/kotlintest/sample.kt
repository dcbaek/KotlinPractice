package com.example.kotlintest

fun main() {

    ///3. String Template

    val name = "Joyce"
    println("my name is $name")

    hellWorld()

    println(add(4,5))
}

// 1. 함수

fun hellWorld() : Unit {
    println("Hello World!")
}

fun add( a: Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value

fun hi() {
    val a : Int = 10
    var b : Int = 9

    var e : String

    b = 100

    val c = 100
    var d = 100

    var name = "joyce"
}