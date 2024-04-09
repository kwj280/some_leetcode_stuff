package org.example.HackerRank

fun lonelyInteger(a: Array<Int>): Int {
    val set = mutableSetOf<Int>()
    a.forEach {
        if (set.contains(it)) {
            set.remove(it)
        } else {
            set.add(it)
        }
    }
    return set.first()
}