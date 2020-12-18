package com.algorithms.dynamicprogramming.memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * *
 * write a function howSum(targetSum, numbers) that takes in a targetSum and an array of numbers as arguments.
 *
 * The function should return an array containing any combination of elements that up to the targetSum. If there is
 * no combination that adds up to the targetSum, then return null.
 *
 * If there are multiple combinations possible, you may return any signle one.
 *
 * You may use an element of the array as many times as needed.
 *
 * You may assume that all input numbers are nonnegative.
 *
 * */

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowSum {
	public static List<Integer> howSum(long targetSum, int[] numbers, Map<Long, List<Integer>> memo) {
		if (memo.containsKey(targetSum)) {
			return memo.get(targetSum);
		}
		if (targetSum == 0) {
			return new ArrayList<Integer>();
		}
		if (targetSum < 0)
			return null;
		for (int num : numbers) {
			long reminder = targetSum - num;
			List<Integer> reminderResult = howSum(reminder, numbers, memo);

			if (Objects.nonNull(reminderResult)) {
				List<Integer> result = Stream.concat(reminderResult.stream(), Stream.of(num))
						.collect(Collectors.toList());
				memo.put(targetSum, result);
				return result;
			}
		}
		memo.put(targetSum, null);
		return null;

	}

	public static void main(String[] args) {
		Map<Long, List<Integer>> memo = new HashMap<Long, List<Integer>>();
		System.out.println(howSum(7L, new int[] { 5, 4, 3, 7 }, memo));
		memo.clear();
		System.out.println(howSum(7L, new int[] { 2, 4 }, memo));
		memo.clear();
		System.out.println(howSum(7L, new int[] { 2, 3 }, memo));
		memo.clear();
		System.out.println(howSum(8L, new int[] { 2, 3, 5 }, memo));
		memo.clear();
		System.out.println(howSum(300L, new int[] { 7, 14 }, memo));
	}
}
