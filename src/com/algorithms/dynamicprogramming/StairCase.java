package com.algorithms.dynamicprogramming;

/*
 *	There are n stairs, a person standing at the bottom wants to reach the top. 
 *	The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
 *	
 *	input: 
 *		N - no of steps in staircase
 *		X - array of allowed steps a person can take 
 * 	Time Complexity:
 * 		1) Naive Approach: O(2^N)
 * 		2) Dynamic Programming: O(N)
 **/

public class StairCase {

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

	static int numWays_X_bottomUp(int N, int[] X) {

		if (N == 0)
			return 1;

		int[] nums = new int[N + 1];
		nums[0] = 1;

		for (int i = 1; i <= N; i++) {
			int no_of_ways = 0;
			for (int j : X) {
				if (i - j >= 0) {
					no_of_ways += nums[i - j];
				}
			}
			nums[i] = no_of_ways;
		}

		return nums[N];
	}

	public static void main(String args[]) {
		int s = 44;
		int[] X = { 1, 3, 5 };
		System.out.println("Number of ways using Dynamic Programming = " + numWays_X_bottomUp(s, X));
		System.out.println("Number of ways using Naive = " + numWays_X_Naive(s, X));
	}
}
