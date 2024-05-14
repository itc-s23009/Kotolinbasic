package org.example

fun main(args: Array<String>){
    val score = readln().toInt()
    // 成績判定
    // 0 ~ 59 は D
    // 60 ~ 69 は C
    // 70 ~ 79 は B
    // 80 ~ 89 は A
    // 90 ~ 100 は S
    //  それ以外は、「エラー」と出力
    val message = when (score){
        in 0..59 -> "D"
        in 60 .. 69 -> "C"
        in 70 .. 79 -> "B"
        in 80..89 -> "A"
        in 90 ..100 -> "S"
        else -> "エラー"
    }
    println(message)

    println("----パターン1-----")
    if (score < 0 || score > 100) {
        "エラー"
    } else if (score < 60) {
        "D"
    } else if (score < 70) {
        "C"
    } else if (score < 80) {
        "B"
    } else if (score < 90) {
        "A"
    } else {
        "S"
    }
}