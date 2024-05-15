package org.example

fun main(args: Array<String>) {
    run {
        val answer: Int = getThreeTimes(4)
        println(answer)
    }
    run {
        val answer: Int = getTimes(2, 3)
        println(answer)
    }
    run{
        val answer  = getTimes(2, 3, 4)
        println(answer)
    }
    // 21.13
    run{
        val answer = printTimes(2, 3, 4)
        println(answer)
    }
    // 21.14
    run {
        println("----21.14----")
        printTimes(2, 3)
        printTimes(5, 10, 20)
        printTimes(1, 10, 100, 1000)
        printTimes(2, 2, 2, 2, 2, 2, 2, 2)
    }
}
fun getThreeTimes(value: Int): Int = if (value >= 5) value * 5 else value * 10

fun getTimes(x: Int, y: Int) = x * y

fun getTimes(x: Int, y: Int, z: Int): Unit {
    println("パラメータとして $x と　$y と　$z を受け取りました")
    println("これらの値を全部掛け算とした答えは ${x * y * z} ")
}

// 21.13
fun printTimes(x: Int, y: Int, z: Int) {
    println("----------------------------------")
    println("パラメータとして、 ２ と ３ と ４ を受け取りました")
    println("これらの値を全部掛け算した答えは ２４ です")
    println("----------------------------------")
    println("パラメータとして、 5 と 10 と 8 を受け取りました")
    println("これらの値を全部掛け算した答えは 400 です")
    println("----------------------------------")
    println("パラメータとして、 1 と 2 と 100 を受け取りました")
    println("これらの値を全部掛け算した答えは 200 です")
    println("----------------------------------")
}

//21.14
fun printTimes(vararg numbers: Int) {
    var result = 1
    for (x in numbers) {
        result *= x
    }
    println("すべての数値を掛け算した結果は$result")

}