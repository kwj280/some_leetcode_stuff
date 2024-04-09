package testHackerRank

import hackerRank.alternate
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TwoCharactersTest {

    @Test
    fun test() {
        val input = "abaacdabd"
        val expected = 4
        val actual = alternate(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "beabeefeab"
        val expected = 5
        val actual = alternate(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = "aabd"
        val expected = 2
        val actual = alternate(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val input = "aaaab"
        val expected = 0
        val actual = alternate(input)
        assertEquals(expected, actual)
    }
}