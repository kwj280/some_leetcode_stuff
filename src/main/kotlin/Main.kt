package org.example

fun main() {

}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }
    var longest = strs[0]
    
    strs.forEach {
        val prefixFound = findCommonPrefix(longest, it)
        longest = prefixFound
        if (longest == "") {
            return ""
        }
    }
    return longest
}

// flower, flow => flo
fun findCommonPrefix(str1: String, str2: String): String {
    var ptr = 0
    var output = ""

    while (ptr < str1.length && ptr < str2.length) {
        if (str1[ptr] == str2[ptr]) {
            output += str1[ptr]
            ptr++
        } else {
            return output
        }
    }

    return output
}