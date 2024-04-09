import org.example.Leet171
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Leet171 {

    @Test
    fun testSolution() {
        val sol = Leet171()

        /**
         * A -> 1
         * B -> 2
         * C -> 3
         * ...
         * Z -> 26
         * AA -> 27
         * AB -> 28
         * ...
         */

        var expected = 1
        var actual = sol.titleToNumber("A")
        assertEquals(expected, actual)

        expected = 2
        actual = sol.titleToNumber("B")
        assertEquals(expected, actual)

        expected = 26
        actual = sol.titleToNumber("Z")
        assertEquals(expected, actual)

        expected = 27
        actual = sol.titleToNumber("AA")
        assertEquals(expected, actual)

        expected = 28
        actual = sol.titleToNumber("AB")
        assertEquals(expected, actual)
    }
}