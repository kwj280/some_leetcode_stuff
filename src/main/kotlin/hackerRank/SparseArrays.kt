package org.example.HackerRank


fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val map = mutableMapOf<String, Int>()
    strings.forEach {
        if (map.contains(it)) {
            map[it] = map[it]!! + 1
        } else {
            map[it] = 1
        }
    }

    val result = Array(queries.size) { 0 }
    queries.forEachIndexed { i, query ->
        if (map.contains(query)) {
            result[i] = map[query]!!
        }
    }
    return result
}