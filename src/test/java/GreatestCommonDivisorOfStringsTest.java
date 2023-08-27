import org.junit.Assert;
import org.junit.Test;

import leetcode.automaniac.GreatestCommonDivisorOfStrings;

public class GreatestCommonDivisorOfStringsTest {
    @Test
    public void testABCABCandABC() {
        String word1 = "ABCABC";
        String word2 = "ABC";

        String expected = "ABC";
        String result = new GreatestCommonDivisorOfStrings().gcdOfStrings(word1, word2);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAandA() {
        String word1 = "A";
        String word2 = "A";

        String expected = "A";
        String result = new GreatestCommonDivisorOfStrings().gcdOfStrings(word1, word2);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testABABABandABAB() {
        String word1 = "ABABAB";
        String word2 = "ABAB";

        String expected = "AB";
        String result = new GreatestCommonDivisorOfStrings().gcdOfStrings(word1, word2);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testLEETandCODE() {
        String word1 = "LEET";
        String word2 = "CODE";

        String expected = "";
        String result = new GreatestCommonDivisorOfStrings().gcdOfStrings(word1, word2);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testABCDEFandABC() {
        String word1 = "ABCDEF";
        String word2 = "ABC";

        String expected = "";
        String result = new GreatestCommonDivisorOfStrings().gcdOfStrings(word1, word2);

        Assert.assertEquals(expected, result);
    }
}

/*
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t
 * (i.e., t is concatenated with itself one or more times).
 * 
 * Given two strings str1 and str2, return the largest string x such that x
 * divides both str1 and str2.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 * 
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 * 
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * 
 * 
 * Constraints:
 * 
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */