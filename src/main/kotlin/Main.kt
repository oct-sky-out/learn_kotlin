package com.oct_sky_out

import kotlin.random.Random

fun main() {
    val summarize = Summarize()
    val xs = listOf(1, 2, 3, 4, 5)

    val sum: (xs: List<Int>) -> Int = { xs ->
        summarize.fold(identity = 0, glue = { x, y -> x + y }, xs)
    }

    // TODO 1 : sum 으로 문제1. a에서 b까지 정수를 모두 더하는 함수 `sumIntegers = ...`를 구현하세요.
//    val sumIntegers = ...
//    println(sumIntegers(1, 10)) // 결과는 55가 나와야함.

    // TODO 2 : fold를 이용하여 순열 xs의 모든 수를 곱하는 함수 product를 구현하세요.
//    val product = ...

    // TODO 3 : product를 이용하여 문제2. a에서 b까지 정수를 모두 곱하는 함수 productIntegers를 구현하세요.
//    val productIntegers = ...
//    println(productIntegers(1, 10)) // 결과는 3628800가 나와야함.

    // random 더하기.
    val n = 20
    val xsForRandom = sequence {
        yieldAll(generateSequence {  Random.nextInt(1, 100) })
    }
    .take(n)
    println(sum(xsForRandom.toList())) // 무작위 더하기
//  println(...)
}
