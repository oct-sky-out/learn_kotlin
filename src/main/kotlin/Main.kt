package com.oct_sky_out

fun main() {

    val lazyConfig = LazyInitialization()

    // NOTE : 첫 사용 접근시 초기화. 따라서 lazyConfig.config map을 처음 초기화 할 때 내부의 print문이 동작.
    println("this is main scope : ${lazyConfig.config["baseUrl"]}")

    // NOTE : 두번째 사용시에는 리소스를 재로드하지않음. 캐싱된 값을 사용.
    println("this is main scope : ${lazyConfig.config["apiKey"]}")
}
