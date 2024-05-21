package com.exmple.chap28

import com.example.chap27.Car
import com.example.chap27.Car5

fun main(args: Array<String>) {
    run{
        println("----28.4----")
        val car = Farrari("赤")
        car.drive(100.0)
    }
    run{
        println("----28.5----")
        val car = com.exmple.chap28.Car5("90")
        car.drive(100.0)
    }
}
class Farrari(color: String): Car5(color){
    // 28.3
    override fun drive(d: Double) {
       distance = distance + d
        println("${color}のフェラーリが走っています！ブウォォォーン！")
        println("おお、かっこいい！！！")
        println("マイレージは　${distance}キロになったぜい！")
    }
}

class Car5(color: String): Car5(color){
    override fun drive(d: Double) {
        if (color.toInt() in 80..100) {
            println("プリウスミサイル発進！！")
        } else {
            distance = distance + d
            println("${color}のプリウスが走っています！スィーン！")
            println("すごい静かですね")
            println("マイレージは ${distance}キロです")
            println("トヨタの車はいっぱい走ってもなかなか故障しません")
        }
    }
}