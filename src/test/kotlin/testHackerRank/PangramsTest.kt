package testHackerRank

import org.example.HackerRank.pangrams
import kotlin.test.Test
import kotlin.test.assertEquals

class PangramsTest {

    @Test
    fun test1() {
        val input = "We promptly judged antique ivory buckles for the next prize"
        val expected = "pangram"
        val actual = pangrams(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "We promptly judged antique ivory buckles for the prize"
        val expected = "not pangram"
        val actual = pangrams(input)
        assertEquals(expected, actual)
    }
}