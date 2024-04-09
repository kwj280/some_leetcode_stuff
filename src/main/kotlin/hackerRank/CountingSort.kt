package org.example.HackerRank


/*
 * Complete the 'countingSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun countingSort(arr: Array<Int>): Array<Int> {
    val result = Array(100) { 0 }

    for (i in 0..(result.size / 2)) {
    }
    arr.forEach {
        result[it] = result[it] + 1
    }
    return result
}

