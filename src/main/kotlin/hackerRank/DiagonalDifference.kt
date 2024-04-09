package org.example.HackerRank

import kotlin.math.abs


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var rlPtr = arr.size - 1
    var lrPtr = 0

    var lrSum = 0
    var rlSum = 0
    while (lrPtr < arr.size && rlPtr >= 0) {

        lrSum += arr[lrPtr][lrPtr]
        rlSum += arr[lrPtr][rlPtr]
        lrPtr++
        rlPtr--
        println(lrSum)

    }
    return abs(lrSum - rlSum)
}