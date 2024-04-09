package testHackerRank

import hackerRank.hackerrankInString
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HackerRankInAStringTest {
    @Test
    fun test1() {
        val input = "hereiamstackerrank"
        val expected = "YES"
        val actual = hackerrankInString(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "hackerworld"
        val expected = "NO"
        val actual = hackerrankInString(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = "hhaacckkekraraannk"
        val expected = "YES"
        val actual = hackerrankInString(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val input = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"
        val expected = "NO"
        val actual = hackerrankInString(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        val input = "hacakaeararanaka"
        val expected = "YES"
        val actual = hackerrankInString(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test6() {
        val input = "crackerhackerknar"
        val expected = "NO"
        val actual = hackerrankInString(input)
        assertEquals(expected, actual)
    }
}