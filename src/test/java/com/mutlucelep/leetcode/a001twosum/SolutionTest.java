package com.mutlucelep.leetcode.a001twosum;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testTwoSum() throws Exception {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] expected = {0, 1};

    assertEquals(this.solution.twoSum(nums, target), expected);
  }
}