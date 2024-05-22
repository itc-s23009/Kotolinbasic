package com.example.chap30

fun main(args: Array<String>) {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    val car3 = xbee("青色")

    car1.drive(10.0)
    car2.drive(20.0)
    car3.drive(30.0)
}

abstract class Car(val color: String,) {
    var distance = 0.0
    abstract fun drive(d: Double)
}
class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("歳が運転している${color}のフェラーリが走っています！ブウォォォーン！")
        println("おお、かっこいい！！！")
        println("マイレージは ${distance}キロになったぜい！")
        println("----fin----")
    }
}
class Prius(color: String): Car(color){
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね")
        println("マイレージは ${distance}キロです")
        println("トヨタの車はいっぱい走ってもなかなか故障しません")

    }
}
class xbee(color: String) : Car(color) {
    override fun drive(d: Double) {
      distance += d
        println("${color}のクロスビーが走りました。")
        println("マイレージは、${distance}キロになりました。")
    }

}