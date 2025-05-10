package com.oct_sky_out

class Summarize {
    fun fold(
        identity: Int,
        glue: (result: Int, x: Int) -> Int,
        xs: Sequence<Int>
    ): Sequence<Int> {
        val iter = xs.iterator()
        var result = identity

        return sequence {
            while (iter.hasNext()) {
                result = glue(result, iter.next())
                yield(result)
            }
        }
    }

    fun sum(xs: Sequence<Int>): Sequence<Int> {
        return fold(0, { x, y -> x + y }, xs)
    }
}
