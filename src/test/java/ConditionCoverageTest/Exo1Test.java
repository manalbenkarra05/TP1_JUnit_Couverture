package ConditionCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    public void testPalindromeSimple() {
        assertTrue(Palindrome.isPalindrome("kayak")); // ❌ -> ❌ dans le if => FALSE
    }

    @Test
    public void testPalindromeComplexe() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose")); // espaces + majuscule
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour")); // ✅ -> ✅ dans le if => TRUE
    }

    @Test
    public void testOneChar() {
        assertTrue(Palindrome.isPalindrome("A")); // boucle while non exécutée
    }

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome("")); // boucle while non exécutée
    }

    @Test
    public void testTwoDifferentChars() {
        assertFalse(Palindrome.isPalindrome("ab")); // boucle 1 tour, condition vraie
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); // throw
    }
}
