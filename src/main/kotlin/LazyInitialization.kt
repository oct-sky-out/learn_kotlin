package com.oct_sky_out

import java.util.*

class LazyInitialization {
    val config : Map<String, String> by lazy {
        val baseUrl = "https://jsonplaceholder.typicode.com/"
        val apiKey = UUID.randomUUID().toString()

        println("call by config lazy scope : $baseUrl")
        println("call by config lazy scope : $apiKey")

        mapOf("baseUrl" to baseUrl, "apiKey" to apiKey)
    }

    val publicationConfig : Map<String, String> by lazy(LazyThreadSafetyMode.PUBLICATION) {
        val baseUrl = "https://jsonplaceholder.typicode.com/"
        val apiKey = UUID.randomUUID().toString()

        println("call by config lazy scope : $baseUrl")
        println("call by config lazy scope : $apiKey")

        mapOf("baseUrl" to baseUrl, "apiKey" to apiKey)
    }

}