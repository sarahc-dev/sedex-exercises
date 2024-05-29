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

    @Test
    fun `If input is 20, return 78`() {
        val expected = 23
        val actual = Multiples3Or5().solution(10)
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is 200, return 9168`() {
        val expected = 9168
        val actual = Multiples3Or5().solution(200)
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is negative, return 0`() {
        val expected = 0
        assertEquals(expected, Multiples3Or5().solution(-1))
        assertEquals(expected, Multiples3Or5().solution(-3))
        assertEquals(expected, Multiples3Or5().solution(-10))
    }
}