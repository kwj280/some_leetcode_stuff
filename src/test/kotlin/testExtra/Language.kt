package testExtra

import org.example.extra.NoSupportedLanguageException
import org.example.extra.parseAcceptLanguage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertContentEquals

class Language {

    @Test
    fun test1() {
        val input1 = "fr-CA, fr-FR"
        val input2 = arrayOf("en-US", "fr-FR")
        val actual = parseAcceptLanguage(input1, input2)
        val expected = arrayOf("fr-FR")
        assertContentEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input1 = "en-US"
        val input2 = arrayOf("en-US", "fr-CA")
        val actual = parseAcceptLanguage(input1, input2)
        val expected = arrayOf("en-US")
        assertContentEquals(expected, actual)
    }

    @Test
    fun testException1() {
        val input1 = ""
        val input2 = arrayOf("en-US", "fr-CA")
        assertThrows<NoSupportedLanguageException> {
            val actual = parseAcceptLanguage(input1, input2)
        }
    }

    @Test
    fun testException2() {
        val input1 = "en-US"
        val input2 = arrayOf<String>()
        assertThrows<NoSupportedLanguageException> {
            val actual = parseAcceptLanguage(input1, input2)
        }
    }
}