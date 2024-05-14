package org.example

import kotlin.random.Random

fun main(args: Array<String>){
    print("1:グー 2:チョキ 3:パー を選んでください:")
    val player = readln().toInt()

    //CPUの手をランダムで求める
    val cpu =  Random.nextInt(0, 3) //0、1、2のでどれかになる
    /*
    val message = when (player){
        1 -> {
            when (cpu){
                2 -> "負け"
                1 -> "勝ち"
                else -> "あいこ"
            }
        }
        2 -> {
            when (cpu){
                0 -> "負け"
                2 -> "勝ち"
                else -> "あいこ"
            }
        }
        3 -> {
           when (cpu) {
               1 -> "負け"
               0 -> "勝ち"
               else -> "あいこ"
           }
        }
        else -> "エラー"
    }
    println(message)


    //勝敗判定

    val judge = when {
        player = 0 && cpu == 0 -> "あいこ"
        player = 0 && cpu == 1 -> "勝ち"
        player = 0 && cpu == 2 -> "負け"
        player = 1 && cpu == 0 -> "まけ"
        player = 1 && cpu == 1 -> "あいこ"
        player = 1 && cpu == 2 -> "勝ち"
        player = 2 && cpu == 2 -> "あいこ"
        player = 2 && cpu == 1 -> "負け"
        player = 2 && cpu == 0 -> "勝ち"
        else -> "エラー"
    }
     */
    //勝敗の結果表示
    //勝ち
    //負け
    //あいこ
    val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "まけ"
        2 -> "勝ち"
        else -> "?"
    }
    println(judge)
}