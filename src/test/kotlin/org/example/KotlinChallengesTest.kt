package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class KotlinChallengesTest {
    val list = listOf(1, 1, 2, 3, 5, 8)
    val listWithDuplicates = "aaaabccaadeeee".toList()

    // 1.
    @Test
    fun `finds the last element of a list`() {
        val expected = 8
        val actual = KotlinChallenges().findLastElement(list)
        assertEquals(expected, actual)
    }

    // 2.
    @Test
    fun `finds the last element but one of a list`() {
        val expected = 5
        val actual = KotlinChallenges().findPenultimateElement(list)
        assertEquals(expected, actual)
    }

    // 3.
    @Test
    fun `finds the nth element of a list`() {
        val expected = 2
        val actual = KotlinChallenges().findNthElement(2, list)
        assertEquals(expected, actual)
    }

    // 4.
    @Test
    fun `finds the number of elements in a list`() {
        val expected = 6
        val actual = KotlinChallenges().findLength(list)
        assertEquals(expected, actual)
    }

    // 5.
    @Test
    fun `reverses the list`() {
        val expected = listOf(8, 5, 3, 2, 1, 1)
        val actual = KotlinChallenges().reverseList(list)
        assertEquals(expected, actual)
    }

    // 6.
    @Test
    fun `returns false when list is not a palindrome`() {
        val expected = false
        val actual = KotlinChallenges().isPalindrome(list)
        assertEquals(expected, actual)
    }

    @Test
    fun `returns true when list of odd size is a palindrome`() {
        val palindromeList = listOf(1, 2, 3, 2, 1)
        val expected = true
        val actual = KotlinChallenges().isPalindrome(palindromeList)
        assertEquals(expected, actual)
    }

    @Test
    fun `returns true when list of even size is a palindrome`() {
        val palindromeList = listOf(1, 2, 3, 3, 2, 1)
        val expected = true
        val actual = KotlinChallenges().isPalindrome(palindromeList)
        assertEquals(expected, actual)
    }

    // 7.
    @Test
    fun `flattens a nested list`() {
        val nestedList = listOf(listOf(1, 1), listOf(3, 5))
        val expected = listOf(1, 1, 3, 5)
        val actual = KotlinChallenges().flattenRefactored(nestedList)
        assertEquals(expected, actual)
    }

    @Test
    fun `flattens a nested list with mixed type`() {
        val nestedList = listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))
        val expected = listOf(1, 1, 2, 3, 5, 8)
        val actual = KotlinChallenges().flattenRefactored(nestedList)
        assertEquals(expected, actual)

    // Eduardo's inputs to build up problem
    // val list1 = listOf(1,2)
    // val list2 = listOf(1, listOf(2))
    // val listFinal = listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))
    }

    // 8.
    @Test
    fun `eliminates consecutive duplicates`() {
        val expected = listOf('a', 'b', 'c', 'd', 'e')
        val actual = KotlinChallenges().compress(listWithDuplicates)
        assertEquals(expected, actual)
    }

    // 9.
    @Test
    fun `packs consecutive duplicates into sublists`() {
        val expected = listOf(listOf('a', 'a', 'a', 'a'), listOf('b'), listOf('c', 'c'), listOf('a', 'a'), listOf('d'), listOf('e', 'e', 'e', 'e'))
        val actual = KotlinChallenges().pack(listWithDuplicates)
        assertEquals(expected, actual)
    }

    // 10.
    @Test
    fun `run-length encoding of a list`() {
        val expected = listOf(Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e'))
        val actual = KotlinChallenges().encode(listWithDuplicates)
        assertEquals(expected, actual)
    }

    // 11.
    @Test
    fun `modify run-length encoding`() {
        val expected = listOf(Pair(4, 'a'), 'b', Pair(2, 'c'), Pair(2, 'a'), 'd', Pair(4, 'e'))
        val actual = KotlinChallenges().encodeModified(listWithDuplicates)
        assertEquals(expected, actual)
    }

    // 12.
    @Test
    fun `decodes a run-length list`() {
        val kotlinChallenges = KotlinChallenges()
        val list = kotlinChallenges.encode(listWithDuplicates)
        val expected = listOf('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        val actual = kotlinChallenges.decode(list)
        assertEquals(expected, actual)
    }

    // 13.
    @Test
    fun `run-length encoding direct solution`() {
        val expected = listOf(Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e'))
        val actual = KotlinChallenges().encodeDirect(listWithDuplicates)
        assertEquals(expected, actual)
    }

    // 14.
    @Test
    fun `duplicates the elements of a list`() {
        val expected = listOf('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd')
        val actual = KotlinChallenges().duplicate("abccd".toList())
        assertEquals(expected, actual)
    }

    // 15.
    @Test
    fun `duplicate the elements of a list n times`() {
        val expected = listOf('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')
        val actual = KotlinChallenges().duplicateN(3, "abccd".toList())
        assertEquals(expected, actual)
    }

    // 16.
    @Test
    fun `drop every nth element`() {
        val expected = listOf('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')
        val actual = KotlinChallenges().drop(3, "abcdefghijk".toList())
        assertEquals(expected, actual)
    }

    // 17.
    @Test
    fun `split a list into two parts`() {
        val expected = Pair(listOf('a', 'b', 'c'), listOf('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
        val actual = KotlinChallenges().split(3, "abcdefghijk".toList())
        assertEquals(expected, actual)
    }

    // 18.
    @Test
    fun `extract a slice from a list`() {
        val expected = listOf('d', 'e', 'f', 'g')
        val actual = KotlinChallenges().slice(3, 7, "abcdefghijk".toList())
        assertEquals(expected, actual)
    }

    // 19.
    @Test
    fun `rotate a list N places to the left`() {
        val expectedPositive = listOf('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c')
        val expectedNegative = listOf('j', 'k', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i')
        val kotlinChallenges = KotlinChallenges()
        val actualPositive = kotlinChallenges.rotate(3, "abcdefghijk".toList())
        val actualNegative = kotlinChallenges.rotate(-2, "abcdefghijk".toList())
        assertEquals(expectedPositive, actualPositive)
        assertEquals(expectedNegative, actualNegative)
    }

    // 20.
    @Test
    fun `remove the kth element from a list`() {
        val expected = Pair(listOf('a', 'c', 'd'), 'b')
        val actual = KotlinChallenges().removeAt(1, "abcd".toList())
        assertEquals(expected, actual)
    }
}