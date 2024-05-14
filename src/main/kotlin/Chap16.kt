package org.example

fun main(args: Array<String>) {
 val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400)
    println("１年目の時給は ${a[0]}円です")
    println("１年目の時給は ${a[1]}円です")
    println("１年目の時給は ${a[2]}円です")
    println("１年目の時給は ${a[3]}円です")
    println("１年目の時給は ${a[4]}円です")

    println("----16.3----")
    for (i in 0..4) {
        println("${i + 1}年目の時給は　${a[i]}です")
    }

    println("----16.4----")
    for (i in 0..4){
        println("${i + 1}年目の時給は　${a[i]}です")
    }

    println("----16.8----")
    val i: BooleanArray = booleanArrayOf(true, false, true, true, false)
    val b: ByteArray = byteArrayOf(2, 4, 6, 8, 16, 32)
    val c: ShortArray = shortArrayOf(100, 101, 102, 103, 104 )
    val d: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400)
    val e: LongArray = longArrayOf(100000, 120000, 150000, 180000, 240000)
    val f: FloatArray = floatArrayOf(1.0f, 1.1f, 1.2f, 1.3f, 1.4f)
    val g: DoubleArray = doubleArrayOf(1.0, 10.0, 100.0, 1000.0, 10000.0)

   for (x in i) println("Boolean型のの配列の値　= ${x}")
   for (x in b) println("Byte型の配列の値　= ${x}")
   for (x in c) println("Short型の配列の値　= ${x}")
   for (x in d) println("Int型の配列の値　= ${x}")
   for (x in e) println("Long型の配列の値　= ${x}")
   for (x in f) println("Float型の配列の値　= ${x}")
   for (x in g) println("Double型の配列の値　= ${x}")
}