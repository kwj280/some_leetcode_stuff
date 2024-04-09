import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Leet80 {
    @Test
    fun test() {
        val input = arrayOf(1, 1, 1, 2, 2, 3).toIntArray()
        val actual = removeDuplicates(input)
        val expected = 5
        assertEquals(expected, actual)
        val actualArray = input.slice(0..4).toTypedArray()
        assertContentEquals(arrayOf(1, 1, 2, 2, 3), actualArray)
    }

    @Test
    fun test2() {
        val input = arrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3).toIntArray()
        val actual = removeDuplicates(input)
        val expected = 7
        assertEquals(expected, actual)
        val actualArray = input.slice(0..6).toTypedArray()

        assertContentEquals(arrayOf(0, 0, 1, 1, 2, 3, 3), actualArray)
    }
}