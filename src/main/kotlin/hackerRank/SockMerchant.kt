package org.example.HackerRank


@Throws(IllegalArgumentException::class)
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    if (n != ar.size) {
        throw IllegalArgumentException()
    }

    val set = mutableSetOf<Int>()
    var pair = 0
    ar.forEach {
        if (set.contains(it)) {
            set.remove(it)
            pair++
        } else {
            set.add(it)
        }
    }
    return pair
}