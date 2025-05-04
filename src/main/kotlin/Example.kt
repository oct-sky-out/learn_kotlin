package com.oct_sky_out

// NOTE: 1. 기본 클래스 생성방법(생성자 미포함)
class Example {
    // NOTE: 반드시 초기화가 필요하다.
    val examValue1 = 10
    val examValue2 = "hello"
}

// NOTE: 2. 기본 클래스 생성방법(생성자 포함)
//       기본값은 선택이다.
class Example2(val examValue1 : Int, val examValue2 : String = "hello")

// NOTE: 3. 부 생성자를 이용한 기본 클래스 생성방법
class Example3 {
    val examValue1 : Int
    val examValue2 : String

    constructor(examValue1 : Int, examValue2 : String) {
        this.examValue1 = examValue1
        this.examValue2 = examValue2
    }
}

// NOTE: 4. 클래스 선언 및 init 스코프를 이용한 초기화 혹은 제약조건 적용
class Example4(val examValue1: Int, var examValue2: String) {
    init {
        require(examValue1 > 0) {
            "examValue1 should be positive"
        }

        examValue2 = "default"
        require(examValue2.isNotEmpty()) {
            "examValue2 should has value"
        }
    }
}