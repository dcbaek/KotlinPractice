package com.example.kotlintest

//1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명 함수이다.
// 1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a : Int)
// 2) retun 값으로 사용할 수가 있따.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody)

val square : (Int)->Int ={number : Int->number*number}

val nameAge : (String, Int)->String = {name : String, age:Int ->
    "myname is ${name} I'm ${age}"}

fun main(){
    println(square(12))
    println(nameAge("Joyce",99))
    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println((b.pizzaIsGreat()))

    println(extendString("ariana",28))
    println(calculateGrade(97))

    val lamda : (Double) -> Boolean = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    invokeLamda{ it > 3.22 }
}

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String ={"I'm ${this} and  ${it} years old"}
    return name.introduceMyself(age)
}

// 람다의 Return

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}