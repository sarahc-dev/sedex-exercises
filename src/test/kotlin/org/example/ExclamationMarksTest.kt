package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ExclamationMarksTest {
    @Test
    fun `If input is a return !`() {
        // Arrange
        val exclamationMarks = ExclamationMarks()
        val expected = "!"
        // Act
        val actual = exclamationMarks.replace("!")
        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is a! return !!`() {
        val expected = "!!"
        val actual = ExclamationMarks().replace("a!")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is aeiou return !!!!!`() {
        val expected = "!!!!!"
        val actual = ExclamationMarks().replace("aeiou")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is Hi! return H!!`() {
        val expected = "H!!"
        val actual = ExclamationMarks().replace("Hi!")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is ABCDE, return !BCD!`() {
        val expected = "!BCD!"
        val actual = ExclamationMarks().replace("ABCDE")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is !Hi! Hi! return !H!! H!!`() {
        val expected = "!H!! H!!"
        val actual = ExclamationMarks().replace("!Hi! Hi!")
        assertEquals(expected, actual)
    }
}