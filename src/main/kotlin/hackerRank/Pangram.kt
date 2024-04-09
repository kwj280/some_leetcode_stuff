package org.example.HackerRank

import java.util.*

/*
 * Complete the 'pangrams' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun pangrams(s: String): String {
    val alphabets = mutableSetOf<Char>()
    for (c in 'a'..'z') {
        alphabets.add(c)
    }

    val sentence = s.lowercase(Locale.getDefault())

    sentence.forEach {
        if (alphabets.contains(it)) {
            alphabets.remove(it)
        }
    }

    return if (alphabets.size == 0) {
        "pangram"
    } else {
        "not pangram"
    }
}