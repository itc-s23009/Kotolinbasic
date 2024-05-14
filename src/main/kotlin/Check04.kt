package org.example


fun main(args: Array<String>) {
    // 横は　９　＞＞　１．　縦は　１　＞＞　９　の掛け算表を表示してください
    for (i in 1..9){
        println()
        for (j in 1..9){
            print(" ${i*j}")
        }
    }
    println()
    println("---------")
    val x = 9 downTo 1
    val y = 9 downTo 1
    //最初の見出しを出す
    print(" ")
    for (x1 in x) {
        print("$x1 ")
    }
    println()
    //掛け算を出す
    for (y1 in y) {
        print("$y1 ")
        for (x1 in x){
            print("${x1 * y1} ")
        }
        println()
    }
}