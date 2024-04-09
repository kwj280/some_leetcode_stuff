package testHackerRank

import org.example.HackerRank.sockMerchant
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class SockMerchantTest {

    @Test
    fun test1() {
        val input = arrayOf(1, 2, 1, 2, 1, 3, 2)
        val actual = sockMerchant(7, input)
        val expected = 2
        assertEquals(expected, actual)

    }

    @Test
    fun test2() {
        val input = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
        val actual = sockMerchant(9, input)
        val expected = 3
        assertEquals(expected, actual)
    }

    @Test()
    fun test3() {
        val input = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
        assertThrows<IllegalArgumentException> {
            val actual = sockMerchant(100, input)
        }
    }
}