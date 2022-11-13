package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void target9Test(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expectedNums = {0, 1};
        Assert.assertArrayEquals(expectedNums, TwoSum.twoSum(nums, target));
    }

    @Test
    public void target6Test(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedNums = {1,2};
        Assert.assertArrayEquals(expectedNums, TwoSum.twoSum(nums, target));
    }
}