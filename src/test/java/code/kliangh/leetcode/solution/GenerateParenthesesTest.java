package code.kliangh.leetcode.solution;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GenerateParenthesesTest {

    @Test
    public void getParenthesesCombinationTest() {
        List<String> result = GenerateParentheses.getParenthesesCombination(1);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("()", result.get(0));

        List<String> results = GenerateParentheses.getParenthesesCombination(3);
        Assert.assertEquals(5, results.size());
    }
}