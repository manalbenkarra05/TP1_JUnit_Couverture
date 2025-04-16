package ConditionCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    public void testTrueAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche")); // même lettres
    }

    @Test
    public void testFalseAnagramSameLength() {
        assertFalse(Anagram.isAnagram("chat", "chou")); // même taille, lettres ≠
    }

    @Test
    public void testFalseAnagramDifferentLength() {
        assertFalse(Anagram.isAnagram("chien", "chiens")); // tailles ≠
    }

    @Test
    public void testTrueAnagramWithSpacesAndCase() {
        assertTrue(Anagram.isAnagram("Le Chien", "niche le")); // espaces, casse
    }

    @Test
    public void testNullFirstString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "mot"));
    }

    @Test
    public void testNullSecondString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("mot", null));
    }

    @Test
    public void testSameWord() {
        assertTrue(Anagram.isAnagram("abc", "abc")); // aucune différence
    }
}
