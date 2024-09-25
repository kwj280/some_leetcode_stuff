class Leet387 {

    /**
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     *
     * Example 1:
     *
     * Input: s = "leetcode"
     *
     * Output: 0
     *
     * Explanation:
     *
     * The character 'l' at index 0 is the first character that does not occur at any other index.
     *
     * Example 2:
     *
     * Input: s = "loveleetcode"
     *
     * Output: 2
     *
     * Example 3:
     *
     * Input: s = "aabbc"
     *
     * Output: -1
     *
     *
     * [-1,-1,4]
     */
    fun firstUniqChar(s: String): Int {
        if (s.isEmpty()) {
            return -1
        }
        if (s.length == 1) {
            return 0
        }
        val occurrence = IntArray(26) { Int.MIN_VALUE }

        s.forEachIndexed { index, c ->
            val occurrenceIndex = c.code - 'a'.code
            val occurrencePos = occurrence[occurrenceIndex]
            if (occurrencePos == Int.MIN_VALUE) {
                occurrence[occurrenceIndex] = index
            } else {
                occurrence[occurrenceIndex] = -1
            }
        }
        var minIndex = Int.MAX_VALUE
        occurrence.forEachIndexed { index, num ->
            if (num >= 0) {
                minIndex = num.coerceAtMost(minIndex)
            }
        }
        return if (minIndex == Int.MAX_VALUE) {
            -1
        } else {
            minIndex
        }
    }
}