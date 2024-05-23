package org.example

/*
For a given string s find the character c (or C) with longest consecutive
repetition and return:
Pair(c, l)
where l (or L) is the length of the repetition.
If two or more characters with the same l, return the first in order of appearance
For empty string return Pair(null, 0)

example input: "bbbaaabaaaa"
example output: Pair('a', 4)

// consecutive characters
// Pair is not mutable - can't reassign values of pair
// Character and count are different types - list, array etc should contain same data type?
// Map - keys need to be unique
//  - 'a' -> 2 - how to get around case where character appears twice but not consecutively

// Can do it with 4 variables - current highest char + current highest count, current char in loop + count of current char
// Use regex to split string when char changes - aabbcc -> [aa, bb, cc]
// Create own Pair function - that creates pairs but would need to be run on every iteration. Is this any better than
// the first solution of tracking the variables?
*/

class ConsecutiveRepetition {
    fun longestRepetition(s: String): Pair<Char?, Int> {
        if (s == "") return Pair(null, 0)

        val regex = "(?<=(.))(?!\\1)".toRegex()
        val separatedChars = s.split(regex)
        val result = separatedChars.maxBy { it.length }

        return Pair(result[0], result.length)
    }

    fun option1works(s: String): Pair<Char?, Int> {
        if (s == "") return Pair(null, 0)

        var highestChar = s[0]
        var highestCount = 0
        var currentChar = s[0]
        var currentCount = 0

        for (char in s) {
            // if char == prev char - add to count
            if (char == currentChar) {
                currentCount++
            } else {
                // if char != prev char
                // if count is new highest - update
                if (currentCount > highestCount) {
                    highestChar = currentChar
                    highestCount = currentCount
                }
                currentChar = char
                currentCount = 1
            }
        }
        // Check if last count highest
        if (currentCount > highestCount) {
            highestChar = currentChar
            highestCount = currentCount
        }
        return Pair(highestChar, highestCount)
    }
}