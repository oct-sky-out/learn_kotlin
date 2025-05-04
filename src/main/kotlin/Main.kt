package com.oct_sky_out

fun main() {

    val hero = Hero("kotlin", level = 1)

    // TODO : 히어로의 이름과 레벨을 변경해보세요.
    //      밸리데이션의 정의대로 올바르지않다면, 에러가 발생합니다.
    hero.name = "hero"
    hero.level = 2
}
