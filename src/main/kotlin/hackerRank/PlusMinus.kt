package org.example.HackerRank

import java.math.RoundingMode


//fun main(args: Array<String>) {
//    val n = readln().trim().toInt()
//
//    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
//
//    plusMinus(arr)
//}

fun plusMinus(arr: Array<Int>) {


    plusMinusToRatio(arr).forEach {
        println(it)
    }
}

fun plusMinusToRatio(arr: Array<Int>): Array<String> {

    var numZero = 0
    var numPositive = 0
    var numNegative = 0
    val totalNum = arr.size

    arr.forEach {
        if (it == 0) {
            numZero++
        } else if (it > 0) {
            numPositive++
        } else {
            numNegative++
        }
    }
    println("$numZero, $numPositive, $numNegative")
    val positiveRatio =
        (numPositive.toDouble() / totalNum.toDouble()).toBigDecimal().setScale(6, RoundingMode.HALF_EVEN).toString()
    val negativeRatio =
        (numNegative.toDouble() / totalNum.toDouble()).toBigDecimal().setScale(6, RoundingMode.HALF_EVEN).toString()
    val zeroRatio =
        (numZero.toDouble() / totalNum.toDouble()).toBigDecimal().setScale(6, RoundingMode.HALF_EVEN).toString()
    return arrayOf(positiveRatio, negativeRatio, zeroRatio)
}