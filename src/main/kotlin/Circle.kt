package com.oct_sky_out

class Circle(radius : Int) {
    companion object {
        @JvmStatic
        val PI = 3.14
    }

    var radius = radius
        set(value) {
            // NOTE: 커스텀 게터/세터 내에서 실제 저장된 값을 가리키는 백킹 필드(backing field)다.
            // field -> this.radius
            field = value
        }

    val area get() = (radius * radius) * PI
}