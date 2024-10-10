class Leet451 {

    /**
     * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
     *
     * Return the sorted string. If there are multiple answers, return any of them.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "tree"
     * Output: "eert"
     * Explanation: 'e' appears twice while 'r' and 't' both appear once.
     * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
     * Example 2:
     *
     * Input: s = "cccaaa"
     * Output: "aaaccc"
     * Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
     * Note that "cacaca" is incorrect, as the same characters must be together.
     * Example 3:
     *
     * Input: s = "Aabb"
     * Output: "bbAa"
     * Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
     * Note that 'A' and 'a' are treated as two different characters.
     *
     *
     *  "tree":
     *  {
     *    1-> {t, r}
     *    2-> {e}
     *  }
     */
    fun frequencySort(s: String): String {
        val arrayMap = Array<MutableSet<Char>>(s.length + 1) {
            mutableSetOf()
        }
        val frequency = mutableMapOf<Char, Int>()
        var str = StringBuilder()

        s.forEachIndexed { i, char ->

            if (!frequency.contains(char)) {
                frequency[char] = 1
            } else {
                frequency[char] = frequency[char]!! + 1
            }
            val charFrequency = frequency[char]
            if (charFrequency!! > 1) {
                arrayMap[charFrequency - 1].remove(char)
                arrayMap[charFrequency].add(char)
            } else {
                arrayMap[1].add(char)
            }
        }

        arrayMap.forEachIndexed { index, charSet ->
            charSet.forEach {
                for (i in 0..<index) {
                    str.append(it)
                }
            }
        }
        return str.toString().reversed()
    }


}