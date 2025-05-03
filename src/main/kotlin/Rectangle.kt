package com.oct_sky_out

class Rectangle(var width: Int, var height: Int) {
    var area: Int
        get() = width * height
        set(value) {
            throw RuntimeException("Not Access")
        }

//    val area: Int
//        get() = width * height
}
