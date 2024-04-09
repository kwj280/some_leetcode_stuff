package hackerRank


fun marsExploration(s: String): Int {

    var changed = 0
    s.forEachIndexed { i, char ->
        val expectedChar = if (i % 3 == 0) {
            'S'
        } else if (i % 3 == 1) {
            'O'
        } else {
            'S'
        }
        if (char != expectedChar) {
            changed++
        }
    }
    return changed
}
