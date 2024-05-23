package com.example.chap38

fun main(args: Array<String>) {
    run{
        println("----38.1----")
        val c1 = getTextClosure("さん")
        val c2 = getTextClosure("くん")
        val c3 = getTextClosure("ちゃん")

        val naem1 = c1("武")
        val naem2 = c2("武")
        val naem3 = c3("武")

        println(naem1)
        println(naem2)
        println(naem3)
    }
    run{
        println("----38.3")
        val closure = getContClosure()
        println("クロージャが返した値 = ${closure()}")
        println("クロージャが返した値 = ${closure()}")
        println("クロージャが返した値 = ${closure()}")
    }
    run{
        println("----38.4----")
        val closureA = getContClosure()
        val closureB = getContClosure()
        println("クロージャAが返した値 = ${closureA()}")
        println("クロージャAが返した値 = ${closureA()}")
        println("クロージャBが返した値 = ${closureA()}")
        println("クロージャBが返した値 = ${closureB()}")
        println("クロージャCが返した値 = ${closureB()}")
        println("クロージャCが返した値 = ${closureA()}")
    }
}

fun getTextClosure(x: String): (String) -> String {
    val caller: (String) -> String = fun(name) = name + x
    return caller
}
fun getContClosure() : () -> Int{
    var num = 0
    val c: () -> Int = fun(): Int {
        num++
        return num
    }
    return c
}
