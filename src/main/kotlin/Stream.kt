package com.oct_sky_out

class Stream() {
    companion object {
        val EMPTY_STREAM = null

        fun <T> delay(v :T): () -> T {
            return { v }
        }

        fun <T> force(v : () -> T) : T {
            // TODO 1 : v 함수를 계산(evaluation)하는 코드를 작성하세요.
            return ...
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
            // TODO 2 : tail 함수를 구현해주세요.
            return ...
        }

        fun <T> forEach(func : (arg : T) -> Unit, stream : Pair<T, () -> T >?) {
            when(stream) {
                null -> return
                // TODO 4 : forEach의 ...에 해당하는 로직을 구현해주세요.
                else -> ...
            }

            return forEach(func, tail(stream) as Pair<T, () -> T>?)
        }
    }

    fun integers(start : Int, end : Int): Pair<Int, () -> Int>? {
        if ( start > end ) return EMPTY_STREAM

        // TODO 3 : ...에 들어갈 로직을 구연해 integers 메서드를 완성하세요.
        return streamOf(start, ...) as Pair<Int, () -> Int>?
    }
}