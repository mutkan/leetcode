package com.mutlucelep.leetcode.a118pascalstriangle;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testPascalsTriangle_1() {

        Integer[] one = {1};
        Integer[] two = {1, 1};
        Integer[] three = {1, 2, 1};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(one));
        expected.add(Arrays.asList(two));
        expected.add(Arrays.asList(three));
        List<List<Integer>> actual = solution.generate(3);

        assertEquals(actual, expected);
    }

    @Test
    public void testPascalsTriangle_2() {

        Integer[] one = {1};
        Integer[] two = {1, 1};
        Integer[] three = {1, 2, 1};
        Integer[] four = {1, 3, 3, 1};
        Integer[] five = {1, 4, 6, 4, 1};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(one));
        expected.add(Arrays.asList(two));
        expected.add(Arrays.asList(three));
        expected.add(Arrays.asList(four));
        expected.add(Arrays.asList(five));
        List<List<Integer>> actual = solution.generate(5);

        assertEquals(actual, expected);
    }


    @Test
    public void testPascalsTriangle_3() {
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> actual = solution.generate(0);

        assertEquals(actual, expected);
    }

}