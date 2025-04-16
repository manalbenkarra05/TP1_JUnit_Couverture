package LineCoverageTest;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testNormalNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-3));
    }
}
