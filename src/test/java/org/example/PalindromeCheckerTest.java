package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author pashtet
 */
public class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker;

    @Before
    public void init() {
        palindromeChecker = new PalindromeChecker();
    }

    @Test
    public void testWithEmptyString() {
        assertTrue(palindromeChecker.checkCycle(""));
        assertTrue(palindromeChecker.checkRecursion(""));
    }

    @Test
    public void testWithGoodPalindromeCase1() {
        assertTrue(palindromeChecker.checkCycle("abcba"));
        assertTrue(palindromeChecker.checkRecursion("abcba"));
    }

    @Test
    public void testWithGoodPalindromeCase2() {
        assertTrue(palindromeChecker.checkCycle("123321"));
        assertTrue(palindromeChecker.checkRecursion("123321"));
    }

    @Test
    public void testWithBadPalindromeCase1() {
        assertFalse(palindromeChecker.checkCycle("123421"));
        assertFalse(palindromeChecker.checkRecursion("123421"));
    }

    @Test
    public void testWithBadPalindromeCase2() {
        assertFalse(palindromeChecker.checkCycle("321321"));
        assertFalse(palindromeChecker.checkRecursion("321321"));
    }
}