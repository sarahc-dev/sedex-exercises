package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ConsecutiveRepetitionTest {
    @Test
    fun `if input is empty string, return null, 0`() {
        // Arrange
        val consecutiveRepetition = ConsecutiveRepetition()
        val expected = Pair(null, 0)
        // Act
        val actual = consecutiveRepetition.longestRepetition("")
        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `if input is a, return a, 1`(){
        val expected = Pair('a', 1)
        val actual = ConsecutiveRepetition().longestRepetition("a")
        assertEquals(expected, actual)
    }

    @Test
    fun `if input is aa, return a, 2`() {
        val expected = Pair('a', 2)
        val actual = ConsecutiveRepetition().longestRepetition("aa")
        assertEquals(expected, actual)
    }

    @Test
    fun `if input is bba, return b, 2`() {
        val expected = Pair('b', 2)
        val actual = ConsecutiveRepetition().longestRepetition("bba")
        assertEquals(expected, actual)
    }

    @Test
    fun `if input is bbbaaabaaaa, return a, 4`() {
        val expected = Pair('a', 4)
        val actual = ConsecutiveRepetition().longestRepetition("bbbaaabaaaa")
        assertEquals(expected, actual)
    }
}