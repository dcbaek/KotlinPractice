package com.example.kotlintest

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

// toString(), hashCode(), equals(), copy()

fun main(){
    val ticketA = Ticket ("koreanAir", "joyce", "2018-20-15", 14)
    val ticketB = Ticket ("koreanAir", "joyce", "2018-20-15", 14)

    println(ticketA)
    println(ticketB)
}