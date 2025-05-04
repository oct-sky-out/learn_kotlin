package com.oct_sky_out

class CharactorValidator {
    companion object {
        val ID_REGEX = Regex("([A-Za-z0-9_])\\w+")
        val NICKNAME_REGEX = Regex("([A-Za-z0-9_])\\w+")
        val MAX_LEVEL = 50
        val MIN_LEVEL = 1
    }
}