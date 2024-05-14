package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    println("----15.2----")
    while (true){
        val value1 = Random.nextInt(100)
        val value2 = Random.nextInt(100)
        println("乱数1:$value1 乱数2:$value2")
        if (value1 < 10 && value2 >= 90) break
    }
    println("----15.7----")
    for (x in 1..10) {
        if (x %3 ==0) continue
        print("${x} 回目の繰り返し")
    }
}