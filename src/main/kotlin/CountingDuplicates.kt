package org.example

class CountingDuplicates {
    fun duplicateCount(text: String): Int {
        // any char that is duplicated
        val groupChars = text.groupingBy { it }.eachCount()
        return groupChars.count { it.value > 1 }
    }
}