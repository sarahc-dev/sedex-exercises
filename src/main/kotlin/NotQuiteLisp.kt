package org.example

/*
    ( -> Go up one floor
    ) -> Go down one floor
    for every () he doesn't move - so count the ( and count the ) and the
    answer is the difference
 */

class NotQuiteLisp {
    // Part 1
    fun getFloor(i: String): Int {
        val upCount = i.count { it == '('}
        val downCount = i.count { it == ')' }

        return upCount - downCount
    }

    // Part 2
    fun getPosition(i: String): Int {
        for (index in i.indices) {
            if (getFloor(i.substring(0, index + 1)) < 0) {
                return index + 1
            }
        }
        return 0
    }
}