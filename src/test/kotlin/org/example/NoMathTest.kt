package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NoMathTest {
    @Test
    fun `get input from file`() {
        val expected = "2x3x4"
        val actual = NoMath().getInput("day2-example.txt")[0]
        assertEquals(expected, actual)
    }

    @Test
    fun `if input 1x1x1, returns 7`() {
        val expected = 7
        val actual = NoMath().wrappingPaperSquareFoot("1x1x1")
        assertEquals(expected, actual)
    }

    @Test
    fun `if input 1x1x2, returns 9`() {
        val expected = 11
        val actual = NoMath().wrappingPaperSquareFoot("1x1x2")
        assertEquals(expected, actual)
    }

    @Test
    fun `if input 1x2x2, returns 12`() {
        val expected = 18
        val actual = NoMath().wrappingPaperSquareFoot("1x2x2")
        assertEquals(expected, actual)
    }

    @Test
    fun `if input 2x3x4, returns 58`() {
        val expected = 58
        val actual = NoMath().wrappingPaperSquareFoot("2x3x4")
        assertEquals(expected, actual)
    }

    @Test
    fun `if input 1x1x10, returns 43`() {
        val expected = 43
        val actual = NoMath().wrappingPaperSquareFoot("1x1x10")
        assertEquals(expected, actual)
    }

    @Test
    fun`given example input, returns total square feet`() {
        val expected = 101
        val actual = NoMath().totalSquareFoot("day2-example.txt")
        assertEquals(expected, actual)
    }

    @Test
    fun`given input, returns total square feet`() {
        val expected = 1586300
        val actual = NoMath().totalSquareFoot("day2-input.txt")
        assertEquals(expected, actual)
    }

    @Test
    fun`if input is 2x3x4, returns 34`() {
        val expected = 34
        val actual = NoMath().ribbonLength("2x3x4")
        assertEquals(expected, actual)
    }

    @Test
    fun`if input is 1x1x10, returns 14`() {
        val expected = 14
        val actual = NoMath().ribbonLength("1x1x10")
        assertEquals(expected, actual)
    }

    @Test
    fun`given example input, returns total feet of ribbon`() {
        val expected = 48
        val actual = NoMath().totalRibbonLength("day2-example.txt")
        assertEquals(expected, actual)
    }

    @Test
    fun`given input, returns total feet of ribbon`() {
        val expected = 3737498
        val actual = NoMath().totalRibbonLength("day2-input.txt")
        assertEquals(expected, actual)
    }
}