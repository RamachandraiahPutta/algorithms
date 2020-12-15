package com.algorithms.dynamicprogramming.memoization;

import java.util.HashMap;
import java.util.Map;

/*
 *	There are n stairs, a person standing at the bottom wants to reach the top. 
 *	The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
 *	
 *	input: 
 *		N - no of steps in staircase
 *		X - array of allowed steps a person can take 
 *		m = length of X
 * 	Time Complexity:
 * 		1) Naive Approach: O(m * 2^N)
 * 		2) Dynamic Programming: O(m * N)
 **/

public class StairCaseMemoization {

	static int numWays_X_Naive(int N, int[] X) {
		int no_of_ways = 0;

		if (N == 0)
			return 1;

		for (int i : X) {
			if (N - i >= 0)
				no_of_ways += numWays_X_Naive(N - i, X);
		}

		return no_of_ways;
	}

	static int numWays_X_TopDown(int N, int[] X, Map<Integer, Integer> memo) {

		if (memo.containsKey(N)) {
			return memo.get(N);
		}

		int no_of_ways = 0;

		if (N == 0)
			return 1;

		for (int i : X) {
			if (N - i >= 0)
				no_of_ways += numWays_X_TopDown(N - i, X, memo);
		}
		memo.put(N, no_of_ways);
		return no_of_ways;

	}

	public static void main(String args[]) {
		int s = 44;
		int[] X = { 1, 3, 5 };
		Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
		System.out.println("Number of ways using Dynamic Programming = " + numWays_X_TopDown(s, X, memo));
		System.out.println("Number of ways using Naive = " + numWays_X_Naive(s, X));
	}
}
