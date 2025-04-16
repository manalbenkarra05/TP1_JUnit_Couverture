package BranchCoverageTest;

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
    public void testFizzOnly() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void testBuzzOnly() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testNormalNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void testInvalidZero() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }

    @Test
    public void testInvalidNegative() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-3));
    }
}
