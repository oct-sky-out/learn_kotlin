package com.oct_sky_out

import org.apache.commons.math3.util.ArithmeticUtils.gcd
import kotlin.math.sqrt
import kotlin.random.Random

fun montecarlo(nTrials : Int, truths : () -> Boolean): Double {
    return (1..nTrials).asSequence()
        .map { _ -> if(truths()) 1 else 0  }
        .sum() / nTrials.toDouble()
}

fun  dirichletTest() : Boolean {
    return gcd(Random.nextInt(1, 1000), Random.nextInt(1, 1000)) == 1
}

fun quessPi(nTrials : Int): Double {
    return sqrt(6 / montecarlo(nTrials) { dirichletTest() })
}