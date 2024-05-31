package org.example

// https://github.com/dkandalov/kotlin-99#ninety-nine-kotlin-problems

class KotlinChallenges {
    // 1. Find the last element of a list
    fun findLastElement(list: List<Int>): Int {
        return list.last()
    }

    // 2. Find the penultimate element of a list
    fun findPenultimateElement(list: List<Int>): Int {
        return list[list.size - 2]
    }

    // 3. Find the nth element of a list
    fun findNthElement(position: Int, list: List<Int>): Int {
        return list[position]
    }

    // 4. Find the number of elements in a list
    fun findLength(list: List<Int>): Int {
        return list.size
    }

    // 5. Reverse the list
    fun reverseList(list: List<Int>): List<Int> {
        return list.reversed()
    }

    // 6. Find out whether list is a palindrome
    fun isPalindrome(list: List<Int>): Boolean {
//        for (idx in 0..list.size / 2) {
//            if (list[idx] != list[list.size - idx - 1]) return false
//        }
//        return true

        return list.withIndex().all { (idx) -> list[idx] == list[list.size - idx - 1]}
    }

    // 7. Flatten a nested list structure with different types
    fun flatten(list: List<*>): List<Int> {
        val v2: List<List<Int>> = list.map {
            if (it is Int) { // if it is an Int
                listOf(it) // convert to list
            } else {
                if (it is List<*>) { // if it is a list of 'something' - wildcard type
                    flatten(it) // run this function recursively
                } else { // if not throw runtime error
                    throw RuntimeException("Not a valid input")
                }
            }
        }
        return v2.flatten()
    }

    fun flattenRefactored(list: List<*>): List<Int> =
        list.map {
            when (it) {
                is Int -> listOf(it)
                is List<*> -> flatten(it)
                else -> throw RuntimeException("Not an Int")
            }
        }.flatten()

    // 8. Eliminate consecutive duplicates
    fun compress(list: List<Char>): List<Char> {
        // return as list or set - can convert back to list
        return list.toSet().toList()
    }

    // 9. Pack consecutive duplicates into sublists
    fun pack(list: List<Char>):MutableList<MutableList<Char>> {
        val sublists = mutableListOf<MutableList<Char>>()
        list.forEachIndexed { index, char ->
            if (index == 0 || char != list[index - 1]) {
                sublists.add(mutableListOf(char))
            } else {
                sublists.last().add(char)
            }
        }
        return sublists
    }

    // 10. Run-length encoding of a list
    fun encode(list: List<Char>): List<Pair<Int, Char>> {
        val sublists = pack(list)
        return sublists.map { Pair(it.size, it[0]) }
    }

    // 11. Modified run-length encoding - it element has no duplicates it's simply copied into results list
    fun encodeModified(list: List<Char>): List<*> {
        val sublists = pack(list)
        return sublists.map { if (it.size > 1) Pair(it.size, it[0]) else it[0]}
    }
}