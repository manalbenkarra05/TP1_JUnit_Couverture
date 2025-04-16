package ConditionCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    public void testDeltaPositive() {
        double[] result = QuadraticEquation.solve(1, -3, 2); // delta = 1
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue(result[0] == 1.0 || result[1] == 1.0);
        assertTrue(result[0] == 2.0 || result[1] == 2.0);
    }

    @Test
    public void testDeltaZero() {
        double[] result = QuadraticEquation.solve(1, 2, 1); // delta = 0
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(-1.0, result[0]);
    }

    @Test
    public void testDeltaNegative() {
        assertNull(QuadraticEquation.solve(1, 1, 1)); // delta < 0
    }

    @Test
    public void testAEqualsZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 5, 2)); // a == 0
    }

    @Test
    public void testDeltaVeryBig() {
        double[] result = QuadraticEquation.solve(1, 0, -100); // delta = 400
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue(result[0] == 10.0 || result[1] == 10.0);
        assertTrue(result[0] == -10.0 || result[1] == -10.0);
    }
}
