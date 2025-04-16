package LineCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testSimpleNumbers() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("X", RomanNumeral.toRoman(10));
        assertEquals("C", RomanNumeral.toRoman(100));
    }

    @Test
    public void testCompoundNumbers() {
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("XLII", RomanNumeral.toRoman(42));
        assertEquals("CMXCIX", RomanNumeral.toRoman(999));
    }

    @Test
    public void testInvalidLow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    public void testInvalidHigh() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
