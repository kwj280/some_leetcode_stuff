package testHackerRank

import org.example.HackerRank.flippingBits
import kotlin.test.Test
import kotlin.test.assertEquals

class FlippingBitTest {

    @Test
    fun test() {
        val input = 2147483647L
        val expected = 2147483648
        val actual = flippingBits(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = 0L
        val expected = 4294967295
        val actual = flippingBits(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = 1L
        val expected = 4294967294L
        val actual = flippingBits(input)
        assertEquals(expected, actual)
    }
}