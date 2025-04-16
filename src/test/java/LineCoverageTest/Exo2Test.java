package LineCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    public void testAnagramTrue() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    public void testAnagramFalseSameLength() {
        assertFalse(Anagram.isAnagram("chien", "rendu")); // mêmes longueurs, lettres différentes
    }


    @Test
    public void testAnagramFalseDifferentLength() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    public void testWithSpacesAndCases() {
        assertTrue(Anagram.isAnagram("Le chien", "Niche le"));
    }

    @Test
    public void testNullInputs() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "chien"));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("chien", null));
    }
}

