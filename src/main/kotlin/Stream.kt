package com.oct_sky_out

class Stream() {
    companion object {
        val EMPTY_STREAM = null

        fun <T> delay(v: T): () -> T {
            return { v }
        }

        fun <T> force(v: () -> T): T {
            return v()
        }

        fun <T> streamOf(x: T, y: T): Pair<T, () -> T> {
            return Pair(x, delay(y))
        }

        fun <T> head(stream: Pair<T, *>): T {
            val (head, _) = stream
            return head
        }

        fun <T> tail(stream: Pair<*, () -> T>): T {
            val (_, xs) = stream
            return force(xs)
        }

        fun <T> forEach(func: (arg: T) -> Unit, stream: Pair<T, () -> T>?) {
            when (stream) {
                null -> return
                else -> func(head(stream))
            }

            return forEach(func, tail(stream) as Pair<T, () -> T>?)
        }

        fun <T> printStream(stream: Pair<T, () -> T>?) {
            forEach({ println(it) }, stream)
        }

        fun <T> printIterator(xs: Iterator<T>) {
            for (x in xs) {
                print("$x ")
            }
            println()
        }

        fun isDivisible(x : Int, y : Int) : Boolean {
            return x % y == 0
        }

        fun isEven(x : Int) : Boolean {
            return isDivisible(x, 2)
        }
    }

    fun integers(start: Int, end: Int): Pair<Int, () -> Int>? {
        if (start > end) return EMPTY_STREAM

        return streamOf(start, integers(start + 1, end)) as Pair<Int, () -> Int>?
    }

    fun integersFrom(n: Int): Sequence<Int> {
        var number = n

        return sequence {
            while (true) {
                yield(number)
                number++
            }
        }
    }

    fun finite(n: Int, xs: Iterable<Int>): Sequence<Int> {
        val iter = xs.iterator()
        return sequence {
            for (_i in 0..n - 1) {
                yield(iter.next())
            }
        }
    }

    fun take(n : Int, xs: Iterable<Int>) : List<Int> {
        // TODO 1 : Iterable xs 수열을 받아 n개만큼 추출하여 List로 반환하세요.
        return ...
    }

    fun fibonacciNumbers(): Sequence<Int> {
        var a = 0
        var b = 1

        return sequence {
            while (true) {
                yield(a)
                // TODO 2 : 피보나치 수열 로직을 완성시켜주세요
                ...
            }
        }
    }

    fun <T> filter(isTrueFn: Function1<T ,Boolean>, xs: Iterable<T>): Sequence<T> {
        // TODO 3. filter를 작성하여 isTrueFn 콜백을 실행하여 true만 분류하여주새요.
        ...
    }
}