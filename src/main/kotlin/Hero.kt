package com.oct_sky_out

import kotlin.properties.Delegates

class Hero(name: String, level: Int) {
    var name: String by Delegates.observable(name) {
            _, oldValue, newValue ->
            if (!CharactorValidator.NICKNAME_REGEX.matches(newValue))
                throw IllegalArgumentException("${newValue}은 패턴에 맞지않는 값입니다.")
            else
                println("Change value of $oldValue to $newValue")
    }

    var level: Int by Delegates.observable(level) {
            _, oldValue, newValue -> when (newValue) {
                in CharactorValidator.MIN_LEVEL .. CharactorValidator.MAX_LEVEL -> {
                    println("Change value of $oldValue to $newValue")
                }
                else -> throw IllegalArgumentException("${newValue} 값은 올바르지않습니다.")
            }
    }
}