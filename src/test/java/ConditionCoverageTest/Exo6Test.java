package ConditionCoverageTest;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // divisible par 3 et 5
    }

    @Test
    public void testFizzOnly() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6)); // divisible par 3 uniquement
    }

    @Test
    public void testBuzzOnly() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // divisible par 5 uniquement
    }

    @Test
    public void testNormalNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7)); // ni 3 ni 5
    }

    @Test
    public void testInvalidZero() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0)); // n == 0
    }

    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-1)); // n < 0
    }
}
