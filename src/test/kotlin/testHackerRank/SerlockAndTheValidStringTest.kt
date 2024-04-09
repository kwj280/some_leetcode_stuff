package testHackerRank

import hackerRank.isValid
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SerlockAndTheValidStringTest {

    @Test
    fun test1() {
        val input = "aabbcd"
        val actual = isValid(input)
        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "aabbccddeefghi"
        val actual = isValid(input)
        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = "abcdefghhgfedecba"
        val actual = isValid(input)
        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val input = "abc"
        val actual = isValid(input)
        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        val input = "aaaaaaaaac"
        val actual = isValid(input)
        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun test6() {
        val input = "aaaabbcc"
        val actual = isValid(input)
        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun test7() {
        val input = "aabbc"
        val actual = isValid(input)
        val expected = "YES"
        assertEquals(expected, actual)
    }
}