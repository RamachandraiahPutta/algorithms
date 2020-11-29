package com.algorithms.dynamicprogramming;

/*
 * The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order.
 * 
 * 	Time Complexity:
 * 		1) Using recursion: exponential (2^N)
 * 		2) Using dynamic programming :  N^2
 * 
 * 	Input  : arr[] = {3, 10, 2, 11}
 *	LIS[] = {1, 1, 1, 1} (initially)
 *	Iteration-wise simulation :
 *	
 *	arr[2] > arr[1] {LIS[2] = max(LIS [2], LIS[1]+1)=2}
 *	arr[3] < arr[1] {No change}
 *	arr[3] < arr[2] {No change}
 *	arr[4] > arr[1] {LIS[4] = max(LIS [4], LIS[1]+1)=2}
 *	arr[4] > arr[2] {LIS[4] = max(LIS [4], LIS[2]+1)=3}
 *	arr[4] > arr[3] {LIS[4] = max(LIS [4], LIS[3]+1)=3}
 * 
 * */
public class LongestIncreasingSubsequence {

	public static int lis(int[] array, int n) {

		int[] auxilaryLis = new int[n];

		for (int i = 0; i < n; i++) {
			auxilaryLis[i] = 1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i] > array[j] && auxilaryLis[i] < auxilaryLis[j] + 1) {
					auxilaryLis[i] = 1 + auxilaryLis[j];
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++)
			if (max < auxilaryLis[i])
				max = auxilaryLis[i];

		return max;

	}

	public static void main(String args[]) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n) + "\n");
	}
}
