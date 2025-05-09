package com.oct_sky_out

import kotlin.random.Random as KtRandom
import java.util.Random as JRandom

class HerbSimulation {

    companion object {
        const val HERB_RATIO = 0.2
        val herbAvailabilities = binomialDistribution(HERB_RATIO)

        fun binomialDistribution(successRatio : Double) : Sequence<Boolean> {
            if(successRatio !in 0.0..1.0) {
                throw IllegalArgumentException("success ratio must be between 0 and 1.0")
            }
            return Stream.repeat { KtRandom.nextDouble(1.0) <= successRatio }
        }

        fun discreteUniformDistribution(low: Int, high : Int) : Sequence<Int> {
            return Stream.repeat { KtRandom.nextInt(low, high + 1)  }
        }

        fun normalDistribution(mean : Double, standardDeviation: Double ) : Sequence<Double> {
            return Stream.repeat { standardDeviation * JRandom().nextGaussian() + mean }
        }
    }

    enum class HerbQuality(val quality: Int) {
        Excellent(0), Good(1), Marginal(2), Poor(3);

        companion object {
            fun find(quality: Int) : HerbQuality {
                return when(quality) {
                    0 -> Excellent
                    1 -> Good
                    2 -> Marginal
                    3 -> Poor
                    else -> throw IllegalArgumentException("Unknown quality $quality")
                }
            }
        }
    }

    fun guessQuality(qualities: Sequence<Int>) : (isAvailable : Boolean) -> HerbQuality {
        val iter = qualities.iterator()

        return { isAvailable -> if(isAvailable) HerbQuality.Excellent else HerbQuality.find(iter.next()) }
    }
}