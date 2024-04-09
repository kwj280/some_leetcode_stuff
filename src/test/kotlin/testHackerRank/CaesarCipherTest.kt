package testHackerRank

import hackerRank.caesarCipher
import kotlin.test.Test
import kotlin.test.assertEquals

class CaesarCipherTest {

    @Test
    fun test() {
        val input = "abcdefghijklmnopqrstuvwxyz"
        val actual = caesarCipher(input, 3)
        val expected = "defghijklmnopqrstuvwxyzabc"
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "middle-Outz"
        val actual = caesarCipher(input, 2)
        val expected = "okffng-Qwvb"
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = "abcdefghijklmnopqrstuvwxyz"
        val actual = caesarCipher(input, 2)
        val expected = "cdefghijklmnopqrstuvwxyzab"
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val input = "www.abc.xy"
        val actual = caesarCipher(input, 87)
        val expected = "fff.jkl.gh"
        assertEquals(expected, actual)
    }
}