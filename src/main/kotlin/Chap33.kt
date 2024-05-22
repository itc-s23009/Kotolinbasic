package com.example.chap33


fun main (args:Array<String>){
    run {
        println("----33.3----")
        val pi: Double = 3.14
        println(pi.toString())
    }
    run{
        println("----33.4----")
        val text1: String = "こんにちは"
        val text2: String = "こんにちは"
        if (text1 == text2) {
            println("２つの文字列は同じ内容")
        }else{
            println("２つの文字列は異なる内容")
        }
    }
    run{
        println("----33.6----")
        val text1: String = "こんにちは"
        val text2: String = "こんにちは"
        if (text1.equals(text2)) {
            println("２つの文字列は同じ内容")
        }else{
            println("２つの文字列は異なる内容")
        }
    }
    run{
        println("----33.7----")
        val map = mutableMapOf("Pen" to "ペン")
        map.put("Apple", "アップル")
        val value = map["Apple"]
        println(value)
    }
}

open class Car(val color: String): Any(){
    open fun drive(){
        println("${color}の車が走る！")
    }
}