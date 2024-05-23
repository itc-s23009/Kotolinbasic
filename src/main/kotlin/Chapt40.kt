package com.example.chap40

fun main(args: Array<String>) {
    val list = listOf(
        Person("たけし", 5),
        Person("けんた",5),
        Person("ゆみ", 8)
    )
    run{
        println("----40.1----")
        var pMax: Person? = null
        for (p in list) {
            if (pMax == null || pMax.age < p.age) {
                pMax = p
            }
        }
        println("最年長なのは誰？")
        pMax?.great()
    }
    run{
        println("----40.2----")
        val pMax = list.maxBy { it.age }
        println("最年長なのは誰？")
        pMax.great()
    }
    run{
        println("----40.4----")
        val pMax = list.maxBy(Person::age)
        println("最年長なのは誰？")
        pMax.great()
    }
}

data class Person(val name: String, val age: Int) {
    fun great() {
        println("${name}です。${age}歳です")
    }
}