package org.example

/*
    This time no story, no theory. The examples below show you how to write function accum:
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"
    The parameter of accum is a string which includes only letters from a..z and A..Z.

    // get each char of string
    // Starting with a capital, repeat that string index + 1 times
*/

class Mumbling {
    fun accum(s: String): String {
        return s.mapIndexed { index, char -> char.uppercase() + "$char".lowercase().repeat(index) }.joinToString("-")
    }
}