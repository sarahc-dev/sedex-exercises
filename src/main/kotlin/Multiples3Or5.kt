package org.example

class Multiples3Or5 {
    fun solution(number: Int): Int {
        return (3..<number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
    }
}