package com.algorithms.dynamicprogramming.memoization;

import java.util.HashMap;
import java.util.Map;

/*
 * write a function canSum(targetSum, numbers) that takes in a targetSum and an array of numbers as arguments.
 *
 * The function should return a boolean indicating whether or not it is possible to generate the targetSum using numbers from array.
 *
 * You may use an element of the array as many times as needed.
 *
 * You may assume that all input numbers are nonnegative.
 * */

public class CanSum {

    public static boolean canSum(long targetSum, int[] numebrs, Map<Long, Boolean> memo) {
        if (memo.containsKey(targetSum))
            return memo.get(targetSum);
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0) {
            return false;
        }
        for (int i : numebrs) {
            boolean flag = canSum(targetSum - i, numebrs, memo);
            memo.put(targetSum, flag);
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Map<Long, Boolean> memo = new HashMap<Long, Boolean>();
        System.out.println(canSum(7, new int[]{5, 4, 3, 7}, memo));
        memo.clear();
        System.out.println(canSum(7, new int[]{2, 4}, memo));
        memo.clear();
        System.out.println(canSum(7, new int[]{2, 3}, memo));
        memo.clear();
        System.out.println(canSum(8, new int[]{2, 3, 5}, memo));
        memo.clear();
        System.out.println(canSum(300, new int[]{7, 14}, memo));
    }
}
