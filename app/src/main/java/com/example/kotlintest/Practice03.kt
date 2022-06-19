package com.example.kotlintest

class Book private  constructor(val id : Int, val name : String){

    companion object BookFactory :IdPrivider{

        override fun getId(): Int {
            return 444
        }

        val myBook = "new book"

        fun create() = Book(0, "animal farm")
    }
}

interface IdPrivider {
    fun getId() : Int
}

fun main() {
    val book : Book = Book.create()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}