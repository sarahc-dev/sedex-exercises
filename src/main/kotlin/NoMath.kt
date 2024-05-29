package org.example

import java.io.File
import java.io.InputStream

class NoMath {
    fun getInput(filename: String): List<String> {
        val input: InputStream = File("/Users/sarahclements/IdeaProjects/sedex-exercises/src/main/kotlin/$filename").inputStream()
        val inputAsList = input.bufferedReader().use { it.readLines() }

        return inputAsList
    }

    private fun getSortedDimensions(d: String): List<Int> {
        return d.split("x").map { it.toInt() }.sorted()
    }

    // Part 1
    fun wrappingPaperSquareFoot(d: String): Int {
        val dimensions = getSortedDimensions(d)
        val squareFeet = dimensions[0] * dimensions[1] * 2 + dimensions[1] * dimensions[2] * 2 + + dimensions[0] * dimensions[2] * 2
        val slack = dimensions[0] * dimensions[1]

        return squareFeet + slack
    }

    fun totalSquareFoot(filename: String): Int {
        return getInput(filename).fold(0) { sum, element -> sum + wrappingPaperSquareFoot(element)}
    }

    // Part 2
    fun ribbonLength(d: String): Int {
        val dimensions = getSortedDimensions(d)
        val feetOfRibbon = dimensions[0] * 2 + dimensions[1] * 2
        val feetOfBow = dimensions[0] * dimensions[1] * dimensions[2]
        return feetOfRibbon + feetOfBow
    }

    fun totalRibbonLength(filename: String): Int {
        return getInput(filename).fold(0) { sum, element -> sum + ribbonLength(element)}
    }
}