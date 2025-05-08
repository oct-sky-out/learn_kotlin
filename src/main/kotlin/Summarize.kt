package com.oct_sky_out

class Summarize {
    fun fold(
        identity: Int,
        glue: (result: Int, x: Int) -> Int,
        xs: Sequence<Int>
    ): Sequence<Int> {
        // TODO 4 : fold를 iterator pattern(Iterable Protocol)에 맞게 재구성해보세요.
        ...
    }

    fun sum(xs: Sequence<Int>): Sequence<Int> {
        return fold(0, {x, y -> x + y }, xs)
    }
}
