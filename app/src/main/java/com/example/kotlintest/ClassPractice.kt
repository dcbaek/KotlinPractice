package com.example.kotlintest

class ClassPractice {

}

open class Human(val name : String = "Anonymous") {

    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }

    init {
        println("new human has been born!!")
    }

    fun eatingCake() {
        println("This is so YUMMYY~~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human() {

    override fun singASong(){
        super.singASong()
        println("랄랄라")
        println("my name is :${name}")
    }
}

fun main(){
//    val human = Human("Minsu")
//
//    val stranger = Human()
//
//    human.eatingCake()
//    val mom = Human("Kuri",52)

//    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}