package com.oct_sky_out

class Stream() {
    companion object {
        val EMPTY_STREAM = null

        fun <T> delay(v :T): () -> T {
            return { v }
        }

        fun <T> force(v : () -> T) : T {
            return v()
        }

        fun <T> streamOf(x : T, y : T): Pair<T, () -> T> {
            return Pair(x, delay(y))
        }

        fun <T> head(stream : Pair<T, *>) : T {
            val (head, _) = stream
            return head
        }

        fun <T> tail(stream : Pair<*, () -> T>) : T {
            val (_, xs) = stream
            return force(xs)
        }

        fun <T> forEach(func : (arg : T) -> Unit, stream : Pair<T, () -> T >?) {
            when(stream) {
                null -> return
                else -> func(head(stream))
            }

            return forEach(func, tail(stream) as Pair<T, () -> T>?)
        }

        fun <T> printStream(stream : Pair<T, () -> T>?) {
            forEach({println(it)}, stream)
        }

        fun <T> printIterator(xs : Iterator<T>) {
            for(x in xs) {
                print("$x ")
            }
        }
    }

    fun integers(start : Int, end : Int): Pair<Int, () -> Int>? {
        if ( start > end ) return EMPTY_STREAM

        return streamOf(start, integers(start + 1, end)) as Pair<Int, () -> Int>?
    }

    fun integersFrom(n : Int): Sequence<Int> {
        var number = n

        return sequence {
            while (true) {
                yield(number)
                number++
            }
        }
    }

    fun finite(n : Int, xs: Iterable<Int>) : Sequence<Int> {
        val iter = xs.iterator()
        return sequence {
            for (_i in 0 .. n-1) {
                yield(iter.next())
            }
        }
    }
}