package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountingDuplicatesTest {
    @Test
    fun `If input is a, return 0`() {
        // Arrange
        val countingDuplicates = CountingDuplicates()
        val expected = 0
        // Act
        val actual = countingDuplicates.duplicateCount("a")
        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is aa, return 1`() {
        val expected = 1
        val actual = CountingDuplicates().duplicateCount("aa")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is aabb, return 2`() {
        val expected = 2
        val actual = CountingDuplicates().duplicateCount("aabb")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is aAbb, return 2`() {
        val expected = 2
        val actual = CountingDuplicates().duplicateCount("aAbb")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is abcde, return 0`() {
        val expected = 0
        val actual = CountingDuplicates().duplicateCount("abcde")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is aabBcde, return 2`() {
        val expected = 2
        val actual = CountingDuplicates().duplicateCount("aabBcde")
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is Indivisibilities, return 2`() {
        val expected = 2
        val actual = CountingDuplicates().duplicateCount("Indivisibilities")
        assertEquals(expected, actual)
    }
}