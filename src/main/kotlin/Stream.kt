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
    }
}