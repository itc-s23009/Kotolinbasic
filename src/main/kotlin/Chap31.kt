package com.example.chap31

fun main(args: Array<String>) {
    val Person = FlyingPerson("たけし", 5)
    val car = FlyingCar("赤")
    makeItFly(Person)
    makeItFly(car)
}
fun makeItFly(a: Flyable) {
    a.fly()
}

interface Flyable {
   fun fly(){
       println("未確認飛行物体です")
   }
}

open class Person(val name: String, val age: Int)
class FlyingPerson (name: String, age: Int) : Person(name, age), Flyable//{
//    override fun fly() {
//        println("まさか！ 人間が空を飛んでいます。")
//    }
//}
abstract class Car(val color: String)
class FlyingCar(color: String): Car(color), Flyable//{
//    override fun fly() {
//        println("すごい！ 車が空を飛んでいます。")
//    }
//}