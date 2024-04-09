import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Leet122 {
    @Test
    fun test() {
        val input = arrayOf(7, 1, 5, 3, 6, 4).toIntArray()
        val expected = 7
        val actual = maxProfit2(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = arrayOf(1, 2, 3, 4, 5).toIntArray()
        val expected = 4
        val actual = maxProfit2(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = arrayOf(7, 6, 4, 3, 1).toIntArray()
        val expected = 0
        val actual = maxProfit2(input)
        assertEquals(expected, actual)
    }
}