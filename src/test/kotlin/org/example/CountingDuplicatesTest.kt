package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountingDuplicatesTest {
    @Test
    fun `If input is a, return (`() {
        // Arrange
        val countingDuplicates = CountingDuplicates()
        val expected = 0
        // Act
        val actual = countingDuplicates.duplicateCount("a")
        // Assert
        assertEquals(expected, actual)
    }
}