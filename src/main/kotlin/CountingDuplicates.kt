package org.example

class CountingDuplicates {
    fun duplicateCount(text: String): Int {
        val groupChars = text.groupingBy { it.lowercase() }.eachCount()
        return groupChars.count { it.value > 1 }
    }
}