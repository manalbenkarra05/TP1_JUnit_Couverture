package BranchCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testRomanSimple() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("II", RomanNumeral.toRoman(2));
    }

    @Test
    public void testRomanSubtractives() {
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("XL", RomanNumeral.toRoman(40));
        assertEquals("XC", RomanNumeral.toRoman(90));
        assertEquals("CD", RomanNumeral.toRoman(400));
        assertEquals("CM", RomanNumeral.toRoman(900));
    }

    @Test
    public void testRomanComplex() {
        assertEquals("MCMXCIX", RomanNumeral.toRoman(1999)); // 1000 + 900 + 90 + 9
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }

    @Test
    public void testRomanLimits() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }

    @Test
    public void testRomanInvalidLow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-5));
    }

    @Test
    public void testRomanInvalidHigh() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(10000));
    }
}
