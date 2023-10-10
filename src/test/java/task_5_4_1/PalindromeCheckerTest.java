package task_5_4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
        assertTrue(checker.isPalindrome("a"));
        assertTrue(checker.isPalindrome(""));
        assertTrue(checker.isPalindrome("1234321"));
        assertTrue(checker.isPalindrome("SaippuaKiviKauppias!"));
        assertFalse(checker.isPalindrome("ab"));
    }
}