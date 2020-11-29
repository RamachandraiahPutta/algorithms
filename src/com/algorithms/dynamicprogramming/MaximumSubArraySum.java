package com.algorithms.dynamicprogramming;

/*
 * Problem) write a program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
 * 
 * 	Kadane’s Algorithm:
 *
 *	Initialize:
 *	    max_so_far = 0
 *	    max_ending_here = 0
 *	
 *	Loop for each element of the array
 *	  (a) max_ending_here = max_ending_here + a[i]
 *	  (b) if(max_so_far < max_ending_here)
 *	            max_so_far = max_ending_here
 *	  (c) if(max_ending_here < 0)
 *	            max_ending_here = 0
 *	return max_so_far
 * 
 * 	Time Complexity: O(N)
 * 
 * 
 * */

public class MaximumSubArraySum {

	static int maxSubArraySum(int a[]) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for (int i = 0; i < a.length; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous SubArray sum is " + maxSubArraySum(a));
	}
}
