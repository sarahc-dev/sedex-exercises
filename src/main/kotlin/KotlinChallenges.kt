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

        return list.withIndex().all { (idx) -> list[idx] == list[list.size - idx - 1] }
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
    fun pack(list: List<Char>): MutableList<MutableList<Char>> {
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
        return sublists.map { if (it.size > 1) Pair(it.size, it[0]) else it[0] }
    }

    // 12. Decode a run-length encoded list
    fun decode(list: List<Pair<Int, Char>>): List<Char> {
        return list.flatMap { pair -> List(pair.first) { pair.second } }
    }

    // 13. Run-length encoding direct
    fun encodeDirect(list: List<Char>): MutableList<Pair<Int, Char>> {
        val result = mutableListOf<Pair<Int, Char>>()
        list.forEach {
            if (result.isEmpty() || result.last().second != it) {
                result.add(Pair(1, it))
            } else {
                result[result.size - 1] = Pair(result.last().first + 1, it)
            }
        }
        return result
    }

    // 14. Duplicate the elements of a list
    fun duplicate(list: List<Char>): List<Char> {
        return list.flatMap { char -> List(2) { char } }
    }

    // 15. Duplicate the elements N times
    fun duplicateN(n: Int, list: List<Char>): List<Char> {
        return list.flatMap { char -> List(n) { char } }
    }

    // 16. Drop every Nth element from list
    fun drop(n: Int, list: List<Char>): List<Char> {
        return list.filterIndexed { index, _ -> index !in n - 1 until list.size - 1 step n}
    }

    // 17. Split a list into two parts
    fun split(i: Int, list: List<Char>): Pair<List<Char>, List<Char>> {
        return Pair(list.take(i), list.takeLast(list.size - i))
    }

    // 18. Extract a slice from a list
    fun slice(i: Int, k: Int, list: List<Char>): List<Char> {
        return list.slice(i..<k)
    }

    // 19. Rotate a list N places to the left
    fun rotate(places: Int, list: List<Char>): List<Char> {
        return when {
            places > 0 -> list.takeLast(list.size - places) + list.take(places)
            places < 0 -> list.takeLast(places * -1) + list.take(list.size + places)
            else -> list
        }

    }

    // 20. Remove the Kth element from a list
    fun removeAt(k: Int, list: List<Char>): Pair<List<Char>, Char> {
        // Convert to mutable list and remove element
        // val mutable = list.toMutableList()
        // val removedElement = mutable.removeAt(k)
        // return Pair(mutable.toList(), removedElement)

        // Return filtered list and element
        return Pair(list.filterIndexed { index, _ -> index != k}, list[k])
    }
}