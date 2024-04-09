package testHackerRank

import org.example.HackerRank.timeConversion
import kotlin.test.Test
import kotlin.test.assertEquals

class TimeConversionTest {
    @Test
    fun timeConversionTest() {
        val input = "12:01:00PM"
        val expected = "12:01:00"
        val actual = timeConversion(input)
        assertEquals(expected, actual)
    }

    @Test
    fun timeConversionTest1() {
        val input = "12:01:00AM"
        val expected = "00:01:00"
        val actual = timeConversion(input)
        assertEquals(expected, actual)
    }

    @Test
    fun timeConversionTest2() {
        val input = "12:00:00AM"
        val expected = "00:00:00"
        val actual = timeConversion(input)
        assertEquals(expected, actual)
    }


    @Test
    fun timeConversionTest3() {
        val input = "12:00:00PM"
        val expected = "12:00:00"
        val actual = timeConversion(input)
        assertEquals(expected, actual)
    }

    @Test
    fun timeConversionTest4() {
        val input = "07:05:45PM"
        val expected = "19:05:45"
        val actual = timeConversion(input)
        assertEquals(expected, actual)
    }

    @Test
    fun timeConversionTest5() {
        val input = "07:05:45AM"
        val expected = "07:05:45"
        val actual = timeConversion(input)
        assertEquals(expected, actual)
    }

}