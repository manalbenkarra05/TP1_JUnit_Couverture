package BranchCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    public void testAnagramTrue() {
        assertTrue(Anagram.isAnagram("chien", "niche")); // même lettres
    }

    @Test
    public void testAnagramFalseDifferentLetters() {
        assertFalse(Anagram.isAnagram("chien", "rendu")); // mêmes longueurs, lettres différentes
    }

    @Test
    public void testAnagramFalseDifferentLengths() {
        assertFalse(Anagram.isAnagram("chat", "chats")); // longueur différente
    }

    @Test
    public void testAnagramWithSpacesAndCases() {
        assertTrue(Anagram.isAnagram("Le chien", "Niche le")); // casse et espaces
    }

    @Test
    public void testNullInputFirst() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "mot"));
    }

    @Test
    public void testNullInputSecond() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("mot", null));
    }

    @Test
    public void testSameWord() {
        assertTrue(Anagram.isAnagram("mot", "mot")); // test spécial : même mot
    }
    @Test
    public void testSameLengthButDifferentLetters() {
        assertFalse(Anagram.isAnagram("abcd", "abce")); // même taille mais lettres ≠
    }
    @Test
    public void testDifferentLengthsBranches() {
        assertFalse(Anagram.isAnagram("a", "ab")); // s1.length() != s2.length()
    }
}
