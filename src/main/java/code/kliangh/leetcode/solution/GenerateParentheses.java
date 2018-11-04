package code.kliangh.leetcode.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateParentheses {
    public List<String> getParenthesesCombination(int n) {
        String parentheses = "()";
        List<String> results;
        List<String> combinations = new ArrayList<>(Collections.singletonList("()"));
        for (int i = 0; i < n-1; i ++) {
            List<String> currentCombinations = new ArrayList<>();
            for (String combination : combinations) {
                for (int j = 0; j < combination.length(); j++) {
                    StringBuilder stringBuilder = new StringBuilder(combination);
                    stringBuilder.insert(j, parentheses);

                    if (currentCombinations.contains(stringBuilder.toString())) {
                        continue;
                    }

                    currentCombinations.add(stringBuilder.toString());
                }
                combinations = currentCombinations;
            }
        }
        results = combinations;

        return results;
    }
}
