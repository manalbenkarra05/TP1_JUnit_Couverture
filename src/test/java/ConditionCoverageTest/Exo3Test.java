package ConditionCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    public void testElementFoundMiddle() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(arr, 5)); // array[mid] == element
    }

    @Test
    public void testElementFoundLeft() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, BinarySearch.binarySearch(arr, 1)); // array[mid] > element
    }

    @Test
    public void testElementFoundRight() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(4, BinarySearch.binarySearch(arr, 9)); // array[mid] < element
    }

    @Test
    public void testElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(arr, 8)); // all conditions false
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.binarySearch(arr, 5)); // while not entered
    }

    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5)); // array == null
    }
}
