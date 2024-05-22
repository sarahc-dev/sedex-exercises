package org.example

/*
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
replace("Hi!") === "H!!"
replace("!Hi! Hi!") === "!H!! H!!"

// find vowels - use regex
// replace
*/

class ExclamationMarks {
    fun replace(s: String): String {
        val regex = "[aeiouAEIOU]".toRegex()
        return s.replace(regex, "!")
    }
}