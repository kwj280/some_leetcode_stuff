package testHackerRank

import hackerRank.highestValuePalindrome
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HighestValuePalindromeTest {
    @Test
    fun test() {
        val str = "1231"
        val actual = highestValuePalindrome(str, str.length, 3)
        val expected = "9339"
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val str = "12321"
        val actual = highestValuePalindrome(str, str.length, 1)
        val expected = "12921"
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val str = "3943"
        val actual = highestValuePalindrome(str, str.length, 1)
        val expected = "3993"
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val str = "092282"
        val actual = highestValuePalindrome(str, str.length, 3)
        val expected = "992299"
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        val str = "0011"
        val actual = highestValuePalindrome(str, str.length, 1)
        val expected = "-1"
        assertEquals(expected, actual)
    }

    @Test
    fun test6() {
        val str = "1"
        val actual = highestValuePalindrome(str, str.length, 1)
        val expected = "9"
        assertEquals(expected, actual)
    }

    @Test
    fun test7() {
        val str = "1"
        val actual = highestValuePalindrome(str, str.length, 0)
        val expected = "1"
        assertEquals(expected, actual)
    }

    @Test
    fun test8() {
        val str = "092282" //
        val actual = highestValuePalindrome(str, str.length, 5)
        val expected = "999999"
        assertEquals(expected, actual)
    }
}