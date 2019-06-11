package code.kliangh.algorithm.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    private List<Integer> testData;

    private int positiveTestCase;

    private int negativeTestCase;

    @Before
    public void setUp() {
        testData = Arrays.asList(7, 9, 18, 23, 30, 35, 41);

        positiveTestCase = 23;
        negativeTestCase = 31;
    }

    @Test
    public void searchWithTailRecursion() {
        Assert.assertEquals(3, BinarySearch.searchWithTailRecursion(testData, 0,
                                                                    testData.size(),
                                                                    positiveTestCase));

        Assert.assertEquals(-1, BinarySearch.searchWithTailRecursion(testData, 0,
                                                                     testData.size(),
                                                                     negativeTestCase));
    }
}