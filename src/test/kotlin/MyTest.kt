import org.example.longestCommonPrefix
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MyTest {


    @Test
    fun testLongestCommonPrefix1() {
        val input = arrayOf("flower", "flow", "flight")
        val actual = longestCommonPrefix(input)
        val expected = "fl"
        assertEquals(expected, actual)
    }

    @Test
    fun testLongestCommonPrefix2() {
        val input = arrayOf("dog", "racecar", "car")
        val actual = longestCommonPrefix(input)
        val expected = ""
        assertEquals(actual, expected)
    }

    @Test
    fun testLongestCommonPrefix3() {
        val input = arrayOf("a")
        val actual = longestCommonPrefix(input)
        val expected = "a"
        assertEquals(actual, expected)
    }
}