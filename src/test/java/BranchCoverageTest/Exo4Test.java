package BranchCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    public void testDeuxSolutions() {
        double[] res = QuadraticEquation.solve(1, -3, 2); // delta = 1
        assertNotNull(res);
        assertEquals(2, res.length);
        assertTrue(res[0] == 2.0 || res[1] == 2.0);
        assertTrue(res[0] == 1.0 || res[1] == 1.0);
    }

    @Test
    public void testUneSolution() {
        double[] res = QuadraticEquation.solve(1, 2, 1); // delta = 0
        assertNotNull(res);
        assertEquals(1, res.length);
        assertEquals(-1.0, res[0]);
    }

    @Test
    public void testPasDeSolution() {
        assertNull(QuadraticEquation.solve(1, 2, 3)); // delta < 0
    }

    @Test
    public void testAZeroException() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 3));
    }

    @Test
    public void testAutreDeuxSolutions() {
        double[] res = QuadraticEquation.solve(1, 0, -4); // delta = 16
        assertEquals(2, res.length);
        assertTrue(res[0] == 2.0 || res[1] == 2.0);
        assertTrue(res[0] == -2.0 || res[1] == -2.0);
    }
}
