package LineCoverageTest;

import org.junit.jupiter.api.Test;
import org.example.Palindrome;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    public void testPalindromeSimple() {
        assertTrue(Palindrome.isPalindrome("kayak")); // palindrome classique
    }

    @Test
    public void testPalindromeAvecEspacesEtMajuscules() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose")); // ignore majuscules/espaces
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour")); // mot normal
    }

    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); // cas null
    }
}
