package BranchCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    public void testElementFoundMiddle() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(arr, 5));
    }

    @Test
    public void testElementFoundStart() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, BinarySearch.binarySearch(arr, 1));
    }

    @Test
    public void testElementFoundEnd() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(4, BinarySearch.binarySearch(arr, 9));
    }

    @Test
    public void testElementNotFoundBetween() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(arr, 6)); // déclenche array[mid] > element
    }

    @Test
    public void testElementTooSmall() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(arr, -2)); // déclenche array[mid] > element
    }

    @Test
    public void testElementTooBig() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(arr, 12)); // déclenche array[mid] < element
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.binarySearch(arr, 1));
    }

    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }
}
