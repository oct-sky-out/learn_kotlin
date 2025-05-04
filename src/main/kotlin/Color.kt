package com.oct_sky_out

// NOTE: sealed class가 제작된 의도.
//          1. 모든 서브타입을 컴파일 시점에 알 수 있어 when 식의 Exhaustive 체크가 가능하고
//          2. 미리 허용할 하위 타입을 제한해 예기치 않은 확장을 방지하며
//          3. 타입의 안전한 패턴 매칭을 통한 ADT(algebraic data type, 합집합 타입) 스타일의 표현을 쉽게 해 주는 게 핵심이다.

sealed class Color(
    private val r : Int,
    private val g : Int,
    private val b: Int) {

    fun getColorMap() : Map<String, Int> {
        return mapOf("red" to r, "green" to g, "blue" to b)
    }

    open fun getNegativeColor():Color {
        throw RuntimeException("Get negative color")
    }

    object Red : Color(255, 0, 0) {}
    object Green : Color(0, 255, 0) {}
    object Blue : Color(255, 255, 255) {}
    object White : Color(255, 255, 255) {
        override fun getNegativeColor(): Color {
            return Black
        }
    }
    object Black : Color(0, 0, 0) {
        override fun getNegativeColor(): Color {
            return White
        }
    }
}
