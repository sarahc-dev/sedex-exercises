package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Multiples3Or5Test {
    @Test
    fun `If input is 3, return 3`() {
        // Arrange
        val multiples3Or5 = Multiples3Or5()
        val expected = 3

        // Act
        val actual = multiples3Or5.solution(3)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is 5, return 3`() {
        val expected = 3
        val actual = Multiples3Or5().solution(5)
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is 6, return 8`() {
        val expected = 8
        val actual = Multiples3Or5().solution(6)
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is 10, return 23`() {
        val expected = 23
        val actual = Multiples3Or5().solution(10)
        assertEquals(expected, actual)
    }
}