package hackerRank

import kotlin.math.max


/**
 * 092282 => [0,2], [9,8] //min k = 3
 * 1231 => [2,3] // min k = 1
 */
fun highestValuePalindrome(s: String, n: Int, k: Int): String {
    //handle single char
    val result = s.toCharArray()
    if (s.length == 1) {
        val value = if (k > 0) {
            9
        } else {
            s
        }
        return value.toString()
    }
    val unMatchedPairs = findNonMatchedPalindromePairs(s)
    if (k < unMatchedPairs.size) {
        return "-1"
    }
    unMatchedPairs.forEach {
        val (first, second) = it
        val max = max(first.value, second.value)
        result[first.index] = max.toString()[0]
        result[second.index] = max.toString()[0]
    }

    return result.concatToString()
}

fun findNonMatchedPalindromePairs(s: String): Array<Pair<CharNode, CharNode>> {
    val pairs = mutableListOf<Pair<CharNode, CharNode>>()
    for (i in 0..<(s.length / 2)) {
        val first = s[i]
        val second = s[s.length - 1 - i]
        if (first != second) {
            val firstNode = CharNode(first.digitToInt(), i)
            val secondNode = CharNode(second.digitToInt(), s.length - 1 - i)
            pairs.add(Pair(firstNode, secondNode))
        }
    }
    return pairs.toTypedArray()
}

data class CharNode(
    val value: Int,
    val index: Int
)