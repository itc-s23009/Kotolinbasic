package org.example

fun main(args: Array<String>) {
    val a: IntArray = intArrayOf(1000, 1200, 1500)

    // インデックスを指定して値を参照
    println("１年目の時給は　${a[0]}円です")
    println("２年目の時給は　${a[1]}円です")
    println("３年目の時給は　${a[2]}円です")

    // forループで値を参照
    for (money in a) {
        println("時給は${money}です")
    }

    // forループでインデックスと値を同時に参照
    for ((index, money) in a.withIndex()) {
        println("${index + 1}年目の時給は　${money}です")
    }

    println("----17.3e----")
    val a3 = listOf<Boolean>(true, false, true)
    val b = listOf<Byte>(2, 4, 6, 8, 16, 32)
    val c = listOf<Short>(100, 101, 102, 103, 104)
    val d3 = listOf<Int>(1000, 1200, 1500, 1800, 2400)
    val e3 = listOf<Long>(100000, 120000, 150000, 180000, 240000)
    val f3 = listOf<Float>(1.0f, 1.1f, 1.2f)
    val g3 = listOf<Double>(1.01, 2.01, 2.01)
    val h3 = listOf<String>("こんにちは", "kotolin", "よろしく")

    println("----17.7----")
    val a7: MutableList<String> = mutableListOf("こんにちは", "kotolin", "よろしく")
    for ((i, x) in a7.withIndex()) {
        println("$i ; $x")
    }
    a7.add("どうぞ")
    a7.add("お願いします")
    for ((i, x) in a7.withIndex()) {
        println("$i ; $x")
    }
    println("----17.8----")
    val a8: MutableList<String> = mutableListOf("こんちは", "kotolin", "よろしく")
    a8.add(2,"どうぞ" )
    a8.add (0, "はじめまして")
    for ((i, x)in a8.withIndex()) {
        println("$i ; $x")
    }
    println("----17.9----")
    val a9 = mutableListOf(
        "こんちは", "kotolin", "よろしく"
    )
    a9.removeAt(2)
    for ((i, x) in a9.withIndex()) {
        println("$i ; $x")
    }
    val hoge: MutableList<String> = mutableListOf()
    val fuga = mutableListOf<String>()
}
