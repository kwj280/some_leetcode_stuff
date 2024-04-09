package org.example

import kotlin.math.pow

class Leet171 {

    /**
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27 = 26*1 + 1
     * AB -> 28 = 26 + 2
     * BA -> (26*2) + 1
     * ...
     */
    fun titleToNumber(columnTitle: String): Int {
        var result = 0
        columnTitle.reversed().forEachIndexed { i: Int, char ->
            val num = (char.code - 'A'.code) + 1
            result += if (i == 0) {
                num
            } else {
                (26.0.pow(i.toDouble()).toInt() * num)
            }
        }
        return result
    }
}