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
    }
}