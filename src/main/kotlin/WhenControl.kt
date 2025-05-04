package com.oct_sky_out

class WhenControl {
    fun execute(): Unit {
        val num1 = 10
        println("-------------------------------------------------")
        // NOTE: java의 switch문을 대체하여 사용가능.
        when (num1) {
            0 -> println("num is zero")
            in 1..5 -> println("num is between 1 and 5")
            else -> println("num is neither 1 nor 5")
        }
        println("-------------------------------------------------")

        // when문도 식 형식으로 전개하여 사용이가능하다.
        val whenResult = when (num1) {
            0 -> "num is zero"
            in 1..5 -> "num is between 1 and 5"
            else -> "num is neither 1 nor 5"
        }

        println(whenResult)
        println("-------------------------------------------------")
    }
}