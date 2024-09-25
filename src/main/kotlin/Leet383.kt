class Leet383 {


    /*
     * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     */
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val randomNoteOccurrence = IntArray(26) { 0 }
        val magazineOccurrence = IntArray(26) { 0 }

        magazine.forEach {
            val index = it.code - 'a'.code
            magazineOccurrence[index]++
        }
        ransomNote.forEach {
            val index = it.code - 'a'.code
            randomNoteOccurrence[index]++
        }
        magazineOccurrence.forEachIndexed { index, num ->
            if (magazineOccurrence[index] < randomNoteOccurrence[index]) {
                return false
            }
        }

        return true
    }

}