import org.example.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Leet2483 {
    private val solution = Solution()

    @Test
    fun test1() {
        val input = "YYNY"
        val expected = 2
        val actual = solution.bestClosingTime(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "NNNNN"
        val expected = 0
        val actual = solution.bestClosingTime(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = "YYYY"
        val expected = 4
        val actual = solution.bestClosingTime(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val input = "YYNYYYNYYYNY"
        val expected = 10
        val actual = solution.bestClosingTime(input)
        assertEquals(expected, actual)
    }


    @Test
    fun test5() {
        val input = "YN"
        val expected = 1
        val actual = solution.bestClosingTime(input)
        assertEquals(expected, actual)
    }

}