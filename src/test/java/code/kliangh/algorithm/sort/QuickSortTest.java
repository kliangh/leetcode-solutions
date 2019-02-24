package code.kliangh.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort() {
        List<Integer> testIntegers = Arrays.asList(13, 5, 7, 9, 3, 2, 8);
        List<Integer> answer = Arrays.asList(2, 3, 5, 7, 8, 9, 13);

        QuickSort.sort(testIntegers);
        Assert.assertEquals(answer, testIntegers);
        System.out.println("Result: " + testIntegers.toString());
    }
}