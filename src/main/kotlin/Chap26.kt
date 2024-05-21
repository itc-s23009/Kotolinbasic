package com.example.chap26

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    // プライマリコンストラクタのみを使う場合
    val book1 = Book(
        100,
        "やさしい Kotlin 入門",
        "野崎 英一",
        LocalDate.of(2018, 5, 10).atStartOfDay(),
        LocalDateTime.of(2024, 5, 31, 12, 0, 0)
    )

    val rentalInfo1 = RentalInfo(
        "タケシ", LocalDateTime.now(),
        LocalDateTime.of(2024, 5, 31, 12, 0, 0)
    )

    val rental1 = Rental(book1, true)  // Rental クラスのインスタンスを作成
    val bookWithRental1 = BookWithRental(
        book1, rental1
    )
    val bookInfo1 = BookInfo(
        bookWithRental1.book.id,
        bookWithRental1.book.title,
        bookWithRental1.book.author,
        bookWithRental1.rental.isRental
    )
    bookInfo1.printInfo()

    // 別のBookインスタンスを作成
    val book2 = Book(
        101,
        "たけし",
        "著者",
        LocalDateTime.now(),
        LocalDateTime.of(2024, 5, 28, 0, 0, 0)
    )
    val rental2 = Rental(book2, true)  // Rental クラスのインスタンスを作成
    val bookWithRental2 = BookWithRental(
        book2, rental2
    )
    val bookInfo2 = BookInfo(
        bookWithRental2.book.id,
        bookWithRental2.book.title,
        bookWithRental2.book.author,
        bookWithRental2.rental.isRental
    )
    bookInfo2.printInfo()

    val bookInfo3 = BookInfo(
        book2.id,
        book2.title,
        book2.author,
        true
    )
    bookInfo3.printInfo()
}

data class Book(
    val id: Long,
    val title: String,
    val author: String,
    val publishDate: LocalDateTime,
    val returnDate: LocalDateTime
)

data class Rental(
    val book: Book,
    val isRental: Boolean
)

data class BookWithRental(
    val book: Book,
    val rental: Rental
)

class BookInfo(
    val id: Long,
    val title: String,
    val author: String,
    val isRental: Boolean
) {
    constructor(bookWithRental: BookWithRental) : this(
        bookWithRental.book.id,
        bookWithRental.book.title,
        bookWithRental.book.author,
        bookWithRental.rental.isRental
    )

    fun printInfo() {
        println(
            """
                [ID${id}] $title (${author})
                ${if (isRental) "貸出中です" else "貸出可能です"}
            """.trimIndent()
        )
    }
}

data class RentalInfo(
    val userName: String,
    val rentalDate: LocalDateTime,
    val returnDeadline: LocalDateTime
)
