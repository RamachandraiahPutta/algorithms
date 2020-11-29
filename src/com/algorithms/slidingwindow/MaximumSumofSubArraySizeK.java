package com.algorithms.slidingwindow;

/*
 * 	Problem) Given an array of integers of size ‘n’.
 *	Our aim is to calculate the maximum sum of ‘k’ 
 *  consecutive elements in the array.
 *  
 *  Time Complexity : O(N)
 * 
 * */

public class MaximumSumofSubArraySizeK {

	static int maxSum(int arr[], int k) {
		int length = arr.length;
		int current_max_sum = 0;
		for (int i = 0; i < k; i++) {
			current_max_sum += arr[i];
		}
		int window_sum = current_max_sum;
		for (int i = k; i < length; i++) {
			window_sum = window_sum + arr[i] - arr[i - k];
			if (current_max_sum < window_sum)
				current_max_sum = window_sum;
		}
		return current_max_sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		int k = 4;
		System.out.println(maxSum(arr, k));
	}
}
