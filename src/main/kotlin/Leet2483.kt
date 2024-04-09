package org.example

class Solution {
    fun bestClosingTime(customers: String): Int {
        var score = 0
        var highestScore = 0
        var highestScoreIdx = 0
        var lastVisit = ' '

        customers.forEachIndexed { i, char ->
            if (char == 'Y') {
                score++
            } else {
                score--
            }
            if (score > highestScore) {
                highestScore = score
                highestScoreIdx = i
                lastVisit = char
            }
        }

        if (lastVisit == 'Y') {
            highestScoreIdx++
        }

        return highestScoreIdx
    }
}
