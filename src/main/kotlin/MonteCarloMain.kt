package com.oct_sky_out

import org.apache.commons.math3.util.ArithmeticUtils.gcd
import kotlin.random.Random

fun monteCarlo(experiments: () -> Boolean): Sequence<Double> {
    var n = 0;
    val sums = Summarize().sum(Stream.repeat { if (experiments()) 1 else 0 })

    return sequence {
        for (i in sums) {
            n += 1
            yield(i / n.toDouble())
        }
    }
}

fun dirichletTest(): Boolean {
    return gcd(Random.nextInt(1, 1000), Random.nextInt(1, 1000)) == 1
}