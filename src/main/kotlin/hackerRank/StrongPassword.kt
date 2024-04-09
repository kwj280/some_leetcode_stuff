package hackerRank


/**
 * numbers = "0123456789"
 * lower_case = "abcdefghijklmnopqrstuvwxyz"
 * upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 * special_characters = "!@#$%^&*()-+"
 */
const val MIN_PASSWORD_LENGTH = 6
val numberSet = "0123456789".toSet()
val lowerCaseSet = "abcdefghijklmnopqrstuvwxyz".toSet()
val upperCaseSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toSet()
val specialCharSet = "!@#$%^&*()-+".toSet()

fun minimumNumber(n: Int, password: String): Int {
    var hasNumber = false
    var hasLowerCase = false
    var hasUpperCase = false
    var hasSpecialChar = false

    password.forEach {
        if (numberSet.contains(it)) {
            hasNumber = true
        }
        if (lowerCaseSet.contains(it)) {
            hasLowerCase = true
        }
        if (upperCaseSet.contains(it)) {
            hasUpperCase = true
        }
        if (specialCharSet.contains(it)) {
            hasSpecialChar = true
        }
    }
    val minimumCharCase = 4 - (hasLowerCase.toInt() + hasUpperCase.toInt() + hasSpecialChar.toInt() + hasNumber.toInt())

    return if (n >= MIN_PASSWORD_LENGTH) {
        minimumCharCase
    } else {
        minimumCharCase.coerceAtLeast(MIN_PASSWORD_LENGTH - n)
    }
}


fun Boolean.toInt(): Int {
    return if (this) {
        1
    } else {
        0
    }
}