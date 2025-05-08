package com.oct_sky_out

fun main() {
    Stream.printStream(Stream().integers(1, 5))
    println("-------------------------------------------------------")

    Stream().integersFrom(1)

    val range10 : IntRange = 1..10
    println(range10.iterator())

    Stream.printIterator(range10.iterator())
    println("-------------------------------------------------------")

    val intIterable = Stream().integersFrom(1).asIterable()
    Stream.printIterator(Stream().finite(100, intIterable).iterator())
}
