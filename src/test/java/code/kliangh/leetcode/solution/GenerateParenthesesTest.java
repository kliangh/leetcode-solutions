package code.kliangh.leetcode.solution;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GenerateParenthesesTest {

    @Test
    public void getParenthesesCombinationTest() {
        GenerateParentheses generateParentheses = new GenerateParentheses();

        List<String> result = generateParentheses.getParenthesesCombination(1);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("()", result.get(0));

        List<String> results = generateParentheses.getParenthesesCombination(3);
        Assert.assertEquals(5, results.size());
    }
}