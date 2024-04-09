package hackerRank


fun isValid(s: String): String {
    var frequencyArray = Array(26) { 0 }
    s.forEach { char ->
        val idx = char - 'a'
        frequencyArray[idx]++
    }
    frequencyArray = frequencyArray.filter { it != 0 }.toTypedArray()
    val minFrequency = frequencyArray.min()
    val subArray = Array(frequencyArray.size) { minFrequency }
    frequencyArray.forEachIndexed { i, f ->
        frequencyArray[i] = f - subArray[i]
    }

    if (frequencyArray.max() == 0) {
        return "YES"
    }

    val countZero = frequencyArray.count { it == 0 }
    if (countZero == 1) {
        if (frequencyArray.max() == frequencyArray.filter { it != 0 }.min()) {
            return "YES"
        }
    } else {
        val countOne = frequencyArray.count { it == 1 }
        if (frequencyArray.max() == 1 && countOne == 1) {
            return "YES"
        }
    }

    return "NO"

}

