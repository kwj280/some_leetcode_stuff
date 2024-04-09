package testHackerRank

import hackerRank.findMinMaxSum
import kotlin.test.Test
import kotlin.test.assertEquals

class MinMaxSumTest {

    @Test
    fun testMinMaxSum() {
        val input = arrayOf(1, 2, 3, 4, 5)
        val actual = findMinMaxSum(input)
        val expected = Pair(10L, 14L)
        assertEquals(expected.first, actual.first)
        assertEquals(expected.second, actual.second)
    }

    @Test
    fun testMinMaxSum2() {
        val input = arrayOf(1, 3, 5, 9, 7)
        val actual = findMinMaxSum(input)
        val expected = Pair(16L, 24L)
        assertEquals(expected.first, actual.first)
        assertEquals(expected.second, actual.second)
    }
}