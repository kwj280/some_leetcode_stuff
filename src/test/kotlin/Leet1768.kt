import org.example.Leet1768
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Leet1768 {

    private val solution = Leet1768()

    @Test
    fun test1() {
        val actual = solution.mergeAlternately("abc", "pqr")
        val expected = "apbqcr"
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val actual = solution.mergeAlternately("ab", "pqrs")
        val expected = "apbqrs"
        assertEquals(expected, actual)

    }

    @Test
    fun test3() {
        val actual = solution.mergeAlternately("abcd", "pq")
        val expected = "apbqcd"
        assertEquals(expected, actual)

    }


}