package com.oct_sky_out

class IfControl {
    fun execute(): Unit {
        val num1 = 10

        println("-------------------------------------------------")
        // NOTE: 일반 if문과 같음.
        if (num1 > 0) {
            println("bigger then 0: ${num1}")
        } else if (num1 >= 5) {
            println("same and bigger than 5 : ${num1}")
        } else {
            println("else case")
        }
        println("-------------------------------------------------")

        // NOTE: if문을 식과 같이 사용할 수 있음.
        //       이 때 ifResult 변수에는 if문의 최종 구문이 바인딩 됨.
        val ifResult: String = if (num1 > 0) {
            "bigger then 0: ${num1}"
        } else if (num1 >= 5) {
            "same and bigger than 5 : ${num1}"
        } else {
            "else case"
        }

        println(ifResult)
        println("-------------------------------------------------")
    }
}