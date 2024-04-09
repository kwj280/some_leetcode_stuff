package testHackerRank

import org.example.HackerRank.diagonalDifference
import kotlin.test.Test
import kotlin.test.assertEquals

class DiagonalDifferenceTest {
    @Test
    fun test() {
        val input = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(9, 8, 9)
        )
        val expected = 2
        val actual = diagonalDifference(input)
        assertEquals(expected, actual)
    }
}