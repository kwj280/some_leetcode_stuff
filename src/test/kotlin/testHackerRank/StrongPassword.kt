package testHackerRank

import hackerRank.minimumNumber
import kotlin.test.Test
import kotlin.test.assertEquals

class StrongPassword {

    @Test
    fun test1() {
        val input = "2bbbb"
        val actual = minimumNumber(input.length, input)
        val expected = 2
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "2bb#A"
        val actual = minimumNumber(input.length, input)
        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = "Ab1"
        val actual = minimumNumber(input.length, input)
        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val input = "#HackerRank"
        val actual = minimumNumber(input.length, input)
        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        val input = "#HackerRank123"
        val actual = minimumNumber(input.length, input)
        val expected = 0
        assertEquals(expected, actual)
    }

}