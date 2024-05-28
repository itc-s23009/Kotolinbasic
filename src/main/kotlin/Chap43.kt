package com.example.Chap43

fun main(args: Array<String>) {
    run {
        println("----43.1----")
        val car = Prius("赤")
        repeat(100) {
            car.drive()
        }
    }
}

open class Car(val color: String) {
    protected var fuel = 50.0

    public fun drive() {
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました")
        }else {
            println("ガス欠で、走れません")
        }
    }

    open protected fun letEngineWork() {
        println("ブルルーン")
        fuel -= 1.0
    }
}

class Prius(color: String) : Car(color) {
    override fun letEngineWork() {
        println("スィーーー")
        fuel -= 0.5
    }
}