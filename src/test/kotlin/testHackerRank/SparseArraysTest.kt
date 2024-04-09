package testHackerRank

import org.example.HackerRank.matchingStrings
import kotlin.test.Test
import kotlin.test.assertContentEquals

class SparseArraysTest {

    @Test
    fun testSparseArray() {
        val strings = arrayOf("ab", "ab", "abc")
        val queires = arrayOf("ab", "abc", "bc")
        val expected = arrayOf(2, 1, 0)
        val actual = matchingStrings(strings, queires)
        assertContentEquals(expected, actual)
    }

    @Test
    fun testSparseArray1() {
        val strings = arrayOf("aba", "baba", "aba", "xzxb")
        val queires = arrayOf("aba", "xzxb", "ab")
        val expected = arrayOf(2, 1, 0)
        val actual = matchingStrings(strings, queires)
        assertContentEquals(expected, actual)
    }

    @Test
    fun testSparseArray2() {
        val strings = arrayOf("def", "de", "fgh")
        val queires = arrayOf("de", "lmn", "fgh")
        val expected = arrayOf(1, 0, 1)
        val actual = matchingStrings(strings, queires)
        assertContentEquals(expected, actual)
    }

}