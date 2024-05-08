package org.example

fun main(args: Array<String>) {
    val a: Char = 'え'
    val b: Char = 'び'
    val c: Char = 'し'
    println(a)
    println(b)
    println(c)
    val message01: String = "こんにちは、世界"
    val message02: String = "こんにちは、\n世界"
    val message03: String = "こんにちは"
    val message04: String = "世界"
    val message05: String = message03 + message04
    val world = "世界！"
    val message06 = "こんにちは、$world"
    val message07 = "こんにちは、${world}"
    val h = "8"
    val message08 = "本日働いた時間は、${h}hours"
    val H: Int = 8
    val message09 = "本日働いた時間は、${H}hours"
    val message10 = "このペースで１ヶ月毎日働くと、${H*30}hours のを労働になります"
    val message11 = "このペースで一年間働くと、${H*365}hours の労働になります"
    val message12 = """
        |こんにちは、世界！
        |私は、Kotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことができます。
        |みなさん、一緒に楽しくプログラミングしましょう！
    """.trimIndent()
    println(message01)
    println(message02)
    println(message05)
    println(message06)
    println(message07)
    println(message08)
    println(message09)
    println(message10)
    println(message11)
    println(message12)
}