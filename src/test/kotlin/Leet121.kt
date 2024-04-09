import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Leet121 {

    @Test
    fun test() {
        val input = arrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5
        val actual = maxProfit(input.toIntArray())
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = arrayOf(7, 6, 4, 3, 1)
        val expected = 0
        val actual = maxProfit(input.toIntArray())
        assertEquals(expected, actual)
    }
}