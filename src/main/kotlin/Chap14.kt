package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
    //乱数を生成して、１０未満になるまで繰り返す

    while (Random.nextInt(0..100) >= 10) {

    }
    println("終わり")

    println("----14.e2----")
    //乱数を生成して表示し、１０未満なら終わる

        do {
            val rand = Random.nextInt(0, 100)
            println("生成された数は、$rand です")
        } while (rand >= 100)
        println("１０未満の数が生成されたので終わり")
}