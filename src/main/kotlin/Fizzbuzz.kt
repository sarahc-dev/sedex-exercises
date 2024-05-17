package org.example

/*
  Fizzbuzz:
  takes an integer

  output: if it is a multiple of
  3 -> Fizz
  5 -> Buzz
  3 and 5 -> Fizzbuzz
  else -> number
*/

class Fizzbuzz {
    fun runFizzbuzz(input: Int): String {
        if (input == 3) {
            return "Fizz"
        } else {
            return "Buzz"
        }
    }
}