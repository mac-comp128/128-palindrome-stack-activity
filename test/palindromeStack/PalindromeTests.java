package palindromeStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTests {
    @Test
    public void testDoesReverseModifyTheString() {
        assertFalse("testString".equals(PalindromeUtils.reverse("testString")));
    }

    //TODO: Write more tests for reverse

    @Test
    public void testDoesisPalindromeReverseReturnFalse() {
        assertFalse(PalindromeUtils.isPalindromeReverse("notAPalindrome"));
    }

    //TODO: Write more tests for isPalindromeReverse

}
