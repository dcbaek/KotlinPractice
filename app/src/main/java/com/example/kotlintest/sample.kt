package com.example.kotlintest

fun main() {

    ///3. String Template

    val name = "Joyce"
    val lastName = "Hong"
    println("my name is ${name + lastName} I'm 23")

    println("is thsi true? ${1==0}")

    println("this is 2\$a")

    hellWorld()

    //println(add(4,5))

    checkNum(1)

    forAndWhile()
}

//4. 조건식
fun maxBy(a : Int, b : Int) : Int {

    if(a>b) {
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) =if(a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }

    var b : Int = when(score){
        1-> 1
        2-> 2
        else -> 3
    }

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("pokay")
    }
}

// Expresstion vs Statement

//5. Array and List

// Array

// List 1. List 2. MutableList

fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)//lista listB
    arrayList[0] = 20
}

// 6. For / While

fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students){
        println("${name}")
    }

    for ((index, name) in students.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }

    var sum : Int = 0
    for ( i in 1..10) { //downTo, until
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
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