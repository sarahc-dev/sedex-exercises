import org.example.Fizzbuzz
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzbuzzTest {
    @Test
    fun `If input is a multiple of 3, returns Fizz`() {
        // Arrange
        val fizzbuzz = Fizzbuzz()
        val expected = "Fizz"

        // Act
        val actual = fizzbuzz.runFizzbuzz(3)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `If input is a multiple of 5, returns Buzz`() {
        // Arrange
        val fizzbuzz = Fizzbuzz()
        val expected = "Buzz"

        // Act
        val actual = fizzbuzz.runFizzbuzz(5)

        // Assert
        assertEquals(expected, actual)
    }
}