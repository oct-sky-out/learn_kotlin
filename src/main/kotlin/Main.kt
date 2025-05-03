package com.oct_sky_out

import java.math.BigDecimal

fun main() {
    // NOTE: 코틀린은 세미콜론이 필요없습니다.
    // NOTE: 코틀린은 자동으로 타입을 추론합니다. (자바 11의 var와 동일)

    // TODO: val과 var를 이용한 변수를 선언합니다.

    // NOTE: val은 불변 변수이고, var은 가변 변수를 선언 할 수 있는 예약어입니다.
    val integerVariable = 1
    var stringVariable = "stringVariable"

//    val integerVariable = 1 Error
    stringVariable += " hello"

    val bigDecimalVariable = BigDecimal("12.1")
    val addedBigDecimal = bigDecimalVariable.add(BigDecimal("0.2"))

    println(integerVariable)
    println(stringVariable)

    println(bigDecimalVariable)
    println(addedBigDecimal)
}
