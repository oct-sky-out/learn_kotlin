package com.oct_sky_out

fun main() {
    Stream.printStream(Stream().integers(1, 5))
    println("-------------------------------------------------------")

    Stream().integersFrom(1)

    val range10: IntRange = 1..10
    println(range10.iterator())

    Stream.printIterator(range10.iterator())
    println("-------------------------------------------------------")

    Stream.printIterator(
        Stream().finite(100, Stream().integersFrom(1)).iterator())

    println("-------------------------------------------------------")
    println(Stream.take(10, Stream().integersFrom(1)))
    println("-------------------------------------------------------")

    println(Stream.take(10, Stream().fibonacciNumbers()))
    println("-------------------------------------------------------")

    Stream.printIterator(
        Stream.take(10, Stream.filter(Stream::isEven, Stream().integersFrom(1)))
            .iterator()
    )
    println("-------------------------------------------------------")

    val summarize = Summarize()
    println(Stream.index(11, summarize.sum(Stream().integersFrom(1))))
    println("-------------------------------------------------------")

    // Stackoverflow 에러가 발생하지않고, 무한한 출력이 나옵니다.
//    Stream.printIterator(Stream().map({ it + 1 }, Stream().integersFrom(1)).iterator())
//    println("-------------------------------------------------------")

    print(quessPi(1_000_000))
}
