package com.oct_sky_out

fun colorTypeChecker(color: Color) : String {
    return when (color) {
        is Color.Black -> "black"
        is Color.White -> "white"
        is Color.Green -> "green"
        is Color.Red -> "red"
        is Color.Blue -> "blue"

        // NOTE else 문 필요없음!!!
    }
}

fun main() {
    val xy1 = Axis(1, 23)
    val xy2 = Axis(1, 23)

    println("xy1 is eqaul xy2 = ${xy1 == xy2}")

    println(Color.Green.getColorMap())
    println(colorTypeChecker(Color.Black))

}
