package BranchCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    public void testPalindromeSimple() {
        assertTrue(Palindrome.isPalindrome("kayak")); // ✅ branche true de la boucle
    }

    @Test
    public void testPalindromeWithSpacesAndCaps() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose")); // ✅ ignore espaces
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour")); // ✅ branche false dans la boucle
    }

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome("")); // ✅ condition while non entrée
    }

    @Test
    public void testSingleChar() {
        assertTrue(Palindrome.isPalindrome("A")); // ✅ condition while non entrée
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); // ✅ throw
    }
}
