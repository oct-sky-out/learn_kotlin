package com.oct_sky_out

import kotlin.random.Random

fun main() {
    val summarize = Summarize()
    val xs = listOf(1, 2, 3, 4, 5)

    val sum: (xs: List<Int>) -> Int = { xs ->
        summarize.fold(identity = 0, glue = { x, y -> x + y }, xs)
    }

    // TODO 1 : sumで問題１番である aからbまで全ての定数を足す関数 sumIntegersを作成してください。
//    val sumIntegers = ...
//    println(sumIntegers(1, 10)) // 55

    // TODO 2 : foldを利用し、順列　xsのすべての数を掛け算する　product関数を作成してください。
//    val product = ...

    // TODO 3 : productを利用し、問題2番である aから bまでの数を掛け算するproductIntegers関数を作成してください。
//    val productIntegers = ...
//    println(productIntegers(1, 10)) // 3628800

    // random　
    val n = 20
    val xsForRandom = sequence {
        yieldAll(generateSequence {  Random.nextInt(1, 100) })
    }
    .take(20)
    print(xsForRandom.toList())
    println(sum(xsForRandom.toList())) // 무작위 더하기
    // TODO 4. 上に作成した通り、ランダム数を掛け算する機能も具現してください。
//  println(...)
}
