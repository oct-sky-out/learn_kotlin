package com.oct_sky_out

class Circle(radius : Int) {
    companion object {
        @JvmStatic
        val PI = 3.14
    }

    var radius = radius
        set(value) {
            // field -> this.radius
            field = value
        }

    val area get() = (radius * radius) * PI
}