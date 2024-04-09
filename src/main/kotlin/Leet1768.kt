package org.example

class Leet1768 {

    /**
     * Input: word1 = "abc", word2 = "pqr"
     * Output: "apbqcr"
     */

    fun mergeAlternately(word1: String, word2: String): String {
        if (word1 == "") {
            return word2
        }
        if (word2 == "") {
            return word1
        }

        var ptr1 = 0
        var ptr2 = 0
        var result = ""

        while (ptr1 < word1.length && ptr2 < word2.length) {
            if (result.length % 2 == 0) {
                result += word1[ptr1]
                ptr1++
            } else {
                result += word2[ptr2]
                ptr2++
            }
        }
        if (ptr1 < word1.length) {
            result += word1.substring(ptr1)
        }
        if (ptr2 < word2.length) {
            result += word2.substring(ptr2)

        }
        return result
    }


}