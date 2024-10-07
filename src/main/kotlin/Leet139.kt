class Leet139 {

    /**
     * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
     *
     * Note that the same word in the dictionary may be reused multiple times in the segmentation.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "leetcode", wordDict = ["leet","code"]
     * DP [true, false, false, false, true, false, false, false, true]
     *
     * Output: true
     * Explanation: Return true because "leetcode" can be segmented as "leet code".
     * Example 2:
     *
     * Input: s = "applepenapple", wordDict = ["apple","pen"]
     * Output: true
     * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
     * Note that you are allowed to reuse a dictionary word.
     * Example 3:
     *
     * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
     * Output: false
     */
    fun wordBreakDp(s: String, wordDict: List<String>): Boolean {
        val dp = BooleanArray(s.length)
        s.forEachIndexed { i, char ->
            wordDict.forEach { word ->
                if (i < word.length - 1) {
                    return@forEach
                }

                if (i == word.length - 1 || dp[i - word.length]) {
                    if (s.substring(i - word.length + 1, i + 1) == word) {
                        dp[i] = true
                        return@forEach
                    }
                }

            }
        }

        return dp[s.length - 1]
    }

}
