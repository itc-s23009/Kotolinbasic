package org.example

fun main(args: Array<String>){
    val a = 5
    val b = 10

    if (a < b) {
        println("aのほうが、bよりも小さいです。")
    } else if (a > b) {
        println("aのほうが、bよりも大きい")
    } else{
        println("aとbの値は同じ値です")
    }

    println("----11.8----")
    val age = 14
  //  var message = ""
    val massage = if (age in 13..15){
        //println("中学生です")
        //message = "中学生です"
        println("1番目の条件の処理が行われました")
        "中学生です"
    }else {
       // println("中学生ではありません")
       // message = "中学生ではありません"
        println("2番目の条件の処理が行われました")
        "中学生ではありません"
    }
    println(massage)
}