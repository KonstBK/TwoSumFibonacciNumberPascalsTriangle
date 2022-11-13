package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numsToFindSum = new int[] {2,7,11,15};
        System.out.println(Arrays.toString(TwoSum.twoSum(numsToFindSum, 9)));
        System.out.println(FibonacciNumber.fib(2));
        System.out.println(PascalsTriangle.generate(5));
    }
}