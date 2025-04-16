package ConditionCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testSimple() {
        assertEquals("I", RomanNumeral.toRoman(1)); // boucle while entre et sort
        assertEquals("III", RomanNumeral.toRoman(3));
    }

    @Test
    public void testSubtractiveCases() {
        assertEquals("IV", RomanNumeral.toRoman(4)); // IV = 4
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("XL", RomanNumeral.toRoman(40));
        assertEquals("XC", RomanNumeral.toRoman(90));
        assertEquals("CD", RomanNumeral.toRoman(400));
        assertEquals("CM", RomanNumeral.toRoman(900));
    }

    @Test
    public void testCompositeNumber() {
        assertEquals("MCMXCIV", RomanNumeral.toRoman(1994)); // test toutes conditions
    }

    @Test
    public void testMaxValue() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999)); // test limite supérieure
    }

    @Test
    public void testInvalidLow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0)); // n < 1
    }

    @Test
    public void testInvalidHigh() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000)); // n > 3999
    }
}
