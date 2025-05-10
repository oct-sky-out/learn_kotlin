package com.oct_sky_out

import org.jetbrains.kotlinx.kandy.dsl.plot
import org.jetbrains.kotlinx.kandy.letsplot.export.save
import org.jetbrains.kotlinx.kandy.letsplot.feature.layout
import org.jetbrains.kotlinx.statistics.binning.BinsOption
import org.jetbrains.kotlinx.statistics.kandy.layers.histogram
import kotlin.math.sqrt
import kotlin.random.Random

const val ZERO = 0.0

fun main() {
    Stream.printStream(Stream().integers(1, 5))
    println("-------------------------------------------------------")

    Stream().integersFrom(1)

    val range10: IntRange = 1..10
    println(range10.iterator())

    Stream.printIterator(range10.iterator())
    println("-------------------------------------------------------")

    Stream.printIterator(
        Stream().finite(100, Stream().integersFrom(1)).iterator()
    )

    println("-------------------------------------------------------")
    println(Stream.take(10, Stream().integersFrom(1)))
    println("-------------------------------------------------------")

    println(Stream.take(10, Stream().fibonacciNumbers()))
    println("-------------------------------------------------------")

    Stream.printIterator(
        Stream.take(10, Stream.filter(Stream::isEven, Stream().integersFrom(1)))
            .iterator()
    )
    println("-------------------------------------------------------")

    val summarize = Summarize()
    println(Stream.index(11, summarize.sum(Stream().integersFrom(1))))
    println("-------------------------------------------------------")

    // Stackoverflow 에러가 발생하지않고, 무한한 출력이 나옵니다.
//    Stream.printIterator(Stream().map({ it + 1 }, Stream().integersFrom(1)).iterator())
//    println("-------------------------------------------------------")

    val pi = Stream.map(
        { if (it == ZERO) ZERO else sqrt(6 / it) },
        monteCarlo { dirichletTest() }
    )
    println(Stream.index(100_000, pi))
    println("-------------------------------------------------------")

    Stream.printIterator(Stream.take(10, Stream.repeat { Random.nextDouble(1.0) }).iterator())
    // 0.9874854198274012 0.9344148667915987 0.7407875139712149 0.10191377932250689
    // 0.6971485869167979 0.5590359690310672 0.09550175590153209 0.5551235961814939 0.26712745618464484 0.45436587136583917
    println("-------------------------------------------------------")
    val simulator = HerbSimulation()

    val herbQualities =
        Stream.map(
            fn = {
                simulator.guessQuality(
                    HerbSimulation.discreteUniformDistribution(
                        HerbSimulation.HerbQuality.Excellent.quality,
                        HerbSimulation.HerbQuality.Poor.quality
                    )
                )(it)
            },
            xs = HerbSimulation.herbAvailabilities
        )

    val pairs = listOf(
        Pair(90.0, 10.0),
        Pair(80.0, 20.0),
        Pair(50.0, 30.0),
        Pair(30.0, 40.0),
    )
    val effectDistributionByQuality = pairs.map {
        HerbSimulation.normalDistribution(it.first, it.second)
    }

    val guessEffectFrom: (HerbSimulation.HerbQuality) -> Double = {
        val guess = Stream.index(1, effectDistributionByQuality[it.quality])

        if (guess < 0.0) 0.0
        else if (guess > 100.0) 100.0
        else guess
    }

    val effect = Stream.map(guessEffectFrom, herbQualities)

    val numberOfTrials = 7000
    val neffect = Stream.take(numberOfTrials, effect)

    plot {
        histogram(neffect, binsOption = BinsOption.byNumber(10))
        layout.title = "Monte carlo Herb Simulation"
        layout.xAxisLabel = "Potion effect"
        layout.yAxisLabel = "# Sample"
    }.save("Monte carlo Herb Simulation.png")
}
