package testHackerRank

import org.example.HackerRank.lonelyInteger
import kotlin.test.Test
import kotlin.test.assertEquals

class LonelyInteger {

    @Test
    fun testLonelyInteger() {
        val input = arrayOf(1, 2, 3, 4, 3, 2, 1)
        val expected = 4
        val actual = lonelyInteger(input)
        assertEquals(expected, actual)
    }
}