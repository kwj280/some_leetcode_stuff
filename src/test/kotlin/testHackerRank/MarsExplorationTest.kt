package testHackerRank

import hackerRank.marsExploration
import kotlin.test.Test
import kotlin.test.assertEquals

class MarsExplorationTest {
    @Test
    fun test() {
        val input = "SOSTOT"
        val actual = marsExploration(input)
        val expected = 2
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "SOSSPSSQSSOR"
        val actual = marsExploration(input)
        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = "SOSSOT"
        val actual = marsExploration(input)
        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val input = "SOSSOSSOS"
        val actual = marsExploration(input)
        val expected = 0
        assertEquals(expected, actual)
    }
}