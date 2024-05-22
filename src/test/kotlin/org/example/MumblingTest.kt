package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MumblingTest {
    @Test
    fun `If input is a, returns A`() {
        // Arrange
        val mumbling = Mumbling()
        val expected = "A"

        // Act
        val actual = mumbling.accum("a")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is b, returns B`() {
        // Arrange
        val mumbling = Mumbling()
        val expected = "B"

        // Act
        val actual = mumbling.accum("b")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is ab, returns A-Bb`() {
        val expected = "A-Bb"
        val actual = Mumbling().accum("ab")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is aBc, returns A-Bb-Ccc`() {
        val expected = "A-Bb-Ccc"
        val actual = Mumbling().accum("aBc")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is RqaEzty, returns R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy`() {
        val expected = "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        val actual = Mumbling().accum("RqaEzty")
        assertEquals(expected, actual)
    }
}