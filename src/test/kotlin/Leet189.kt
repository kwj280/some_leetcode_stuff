import kotlin.test.Test
import kotlin.test.assertContentEquals

class Leet189 {

    @Test
    fun test() {
        val input = arrayOf(1, 2, 3, 4, 5, 6, 7).toIntArray()
        rotate(input, 3)
        val expected = arrayOf(5, 6, 7, 1, 2, 3, 4).toIntArray()
        assertContentEquals(expected.toTypedArray(), input.toTypedArray())
    }

    @Test
    fun test2() {
        val input = arrayOf(-1, -100, 3, 99).toIntArray()
        rotate(input, 2)
        val expected = arrayOf(3, 99, -1, -100).toIntArray()
        assertContentEquals(expected.toTypedArray(), input.toTypedArray())
    }
}