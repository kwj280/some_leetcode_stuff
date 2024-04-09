package testHackerRank

import org.example.HackerRank.plusMinusToRatio
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

class PlusMinusTest {

    @Test
    fun testPlusMinus() {
        val input = arrayOf(1, 1, 0, -1, -1)
        val expected = arrayOf("0.400000", "0.400000", "0.200000")
        val actual = plusMinusToRatio(input)
        assertContentEquals(expected, actual)
        assertTrue { true }
    }

    @Test

    fun testPlusMinus2() {
        val input = arrayOf(-4, 3, -9, 0, 4, 1)
        val expected = arrayOf("0.500000", "0.333333", "0.166667")
        val actual = plusMinusToRatio(input)
        assertContentEquals(expected, actual)
    }
}