package com.oct_sky_out

class Circle(radius : Int) {
    companion object {
        // NOTE: const val을 사용하면 자바에서 public static final과 같은 접근제어를 띈다.
        //        컴파일 시점에서 값이 초기화되므로 상수 목적으로 사용하기 좋음
        const val PI = 3.14
    }

    var radius = radius
        set(value) {
            // NOTE: 커스텀 게터/세터 내에서 실제 저장된 값을 가리키는 백킹 필드(backing field)다.
            // field -> this.radius
            field = value
        }

    val area get() = (radius * radius) * PI
}