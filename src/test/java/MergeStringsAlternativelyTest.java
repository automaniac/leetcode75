import org.junit.Assert;
import org.junit.Test;

import leetcode.automaniac.MergeStringsAlternatively;

public class MergeStringsAlternativelyTest {
    @Test
    public void testAbc() {
        String word1 = "abc";
        String word2 = "pqr";

        String expected = "apbqcr";
        String result = MergeStringsAlternatively.mergeAlternately(word1, word2);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAbcd() {
        String word1 = "abcd";
        String word2 = "pq";

        String expected = "apbqcd";
        String result = MergeStringsAlternatively.mergeAlternately(word1, word2);

        Assert.assertEquals(expected, result);

    }

    @Test
    public void testAb() {
        String word1 = "ab";
        String word2 = "pqrs";

        String expected = "apbqrs";
        String result = MergeStringsAlternatively.mergeAlternately(word1, word2);

        Assert.assertEquals(expected, result);
    }
}

/*
 * You are given two strings word1 and word2. Merge the strings by adding
 * letters in alternating order, starting with word1. If a string is longer than
 * the other, append the additional letters onto the end of the merged string.
 * 
 * Return the merged string.
 * 
 * 
 * Example 1:
 * 
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1: a b c
 * word2: p q r
 * merged: a p b q c r
 * Example 2:
 * 
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1: a b
 * word2: p q r s
 * merged: a p b q r s
 * Example 3:
 * 
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1: a b c d
 * word2: p q
 * merged: a p b q c d
 * 
 * 
 * Constraints:
 * 
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 */
