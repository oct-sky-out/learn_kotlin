package com.oct_sky_out

class Summarize {
    fun fold(
        identity: Int,
        glue: (result: Int, x: Int) -> Int,
        xs: List<Int>
    ): Int {
        var result = identity

        for (x in xs) {
            result = glue(result, x)
        }

        return result
    }
}

