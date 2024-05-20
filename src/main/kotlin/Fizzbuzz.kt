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
        return when {
            input % 3 == 0 && input % 5 == 0 && input % 7 == 0 -> "FizzBuzzCazz"
            input % 3 == 0 && input % 5 == 0 -> "FizzBuzz"
            input % 3 == 0 && input % 7 == 0 -> "FizzCazz"
            input % 5 == 0 && input % 7 == 0 -> "BuzzCazz"
            input % 3 == 0 -> "Fizz"
            input % 5 == 0 -> "Buzz"
            input % 7 == 0 -> "Cazz"
            else -> input.toString()
        }
    }
}