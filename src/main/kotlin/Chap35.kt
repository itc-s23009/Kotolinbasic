package com.example.chap35
 fun main(args: Array<String>) {
     run{
         println("----35.2----")
         val p1 = Person("たけし", 1234)
         val p2 = Person("けんた", 1234)
         if (p1 == p2) {
             println("二人は同一人物")
         }else{
             println("二人は別人")
         }
     }
     run{
         println("----35.3----")
         val p1 = Person("たけし", 1234)
         val p2 = Person("たけし", 1234)
         if (p1 == p2) {
             println("二人は同一人物")
         }else{
             println("二人は別人")
         }
     }
     run{
         println("----broken----")
         val p1 = BrokenPerson("たけし", 1234)
         val p2 = BrokenPerson("けんた", 1234)
         if (p1 == p2) {
             println("二人は同一人物")
         }else{
             println("二人は別人")
         }
     }
     run{
         println("----35.10----")
         val p = Person("たけし", 1234)
         println(p.toString())

         println("----broken2----")
         val b = BrokenPerson("武", 1234)
         println(b.toString())
     }
 }
//35.1
data class Person(val name: String, val myNumber: Int)

class BrokenPerson(val name: String, val myNumber: Int)