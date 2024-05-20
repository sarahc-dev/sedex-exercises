import org.example.Fizzbuzz
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzbuzzTest {
    @Test
    fun `If input is 3, returns Fizz`() {
        // Arrange
        val fizzbuzz = Fizzbuzz()
        val expected = "Fizz"

        // Act
        val actual = fizzbuzz.runFizzbuzz(3)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is 5, returns Buzz`() {
        // Arrange
        val fizzbuzz = Fizzbuzz()
        val expected = "Buzz"

        // Act
        val actual = fizzbuzz.runFizzbuzz(5)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is 15, returns Fizzbuzz`() {
        // Arrange
        val fizzbuzz = Fizzbuzz()
        val expected = "FizzBuzz"

        // Act
        val actual = fizzbuzz.runFizzbuzz(15)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is not a multiple of 3 or 5 return input`() {
        val fizzbuzz = Fizzbuzz()
        assertEquals("17", fizzbuzz.runFizzbuzz(17))
    }

    @Test
    fun `If input is a multiple of 3, returns Fizz`() {
        val fizzbuzz = Fizzbuzz()
        assertEquals("Fizz", fizzbuzz.runFizzbuzz(9))
    }

    @Test
    fun `If input is a multiple of 5, returns Buzz`() {
        val fizzbuzz = Fizzbuzz()
        assertEquals("Buzz", fizzbuzz.runFizzbuzz(20))
    }

    @Test
    fun `If input is a multiple of 3 and 5, returns FizzBuzz`() {
        val fizzbuzz = Fizzbuzz()
        assertEquals("FizzBuzz", fizzbuzz.runFizzbuzz(75))
    }

    @Test
    fun `If input is a multiple of 7, returns Cazz`() {
        val fizzbuzz = Fizzbuzz()
        assertEquals("Cazz", fizzbuzz.runFizzbuzz(7))
        assertEquals("Cazz", fizzbuzz.runFizzbuzz(14))
    }

    @Test
    fun `If input is a multiple of 3 and 7, returns FizzCazz`() {
        val fizzbuzz = Fizzbuzz()
        assertEquals("FizzCazz", fizzbuzz.runFizzbuzz(21))
    }

    @Test
    fun `If input is a multiple of 5 and 7, returns BuzzCazz`() {
        val fizzbuzz = Fizzbuzz()
        assertEquals("BuzzCazz", fizzbuzz.runFizzbuzz(35))
    }

    @Test
    fun `If input is a multiple of 3, 5 and 7, returns FizzBuzzCazz`() {
        val fizzbuzz = Fizzbuzz()
        assertEquals("FizzBuzzCazz", fizzbuzz.runFizzbuzz(105))
    }


}