package com.oct_sky_out

class LoopControl {
    companion object {
        val NUMBER_COLLECTION = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    }

    fun executeFor() {
        println("-------------------------------------------------")
        // NOTE: 코틀린의 기본 for문은 아래와 같이 for in문으로 정의한다.
        for(elem in NUMBER_COLLECTION) {
            println("modern for : ${elem}")
        }

        println("-------------------------------------------------")
    }

    fun executeForCompositIndex() {
        println("-------------------------------------------------")
        // NOTE: 기존 자바에서는 인덱스의 원소를 가져 올 수 없었지만 코틀린에서는 가능.
        //      하려면 zip과 같은 알고리즘을 직접 구현하거나, guava와같은 라이브러리를 사용해야했음. 또는 일반 for문을 사용.
        for((idx, elem) in NUMBER_COLLECTION.withIndex()) {
            println("for by KV : ${elem}, index: $idx")
        }
        println("-------------------------------------------------")
    }

    fun executeForEach() {
        println("-------------------------------------------------")
        NUMBER_COLLECTION.forEach { elem ->
            println("for each loop : $elem")
        }
        println("-------------------------------------------------")
    }

}