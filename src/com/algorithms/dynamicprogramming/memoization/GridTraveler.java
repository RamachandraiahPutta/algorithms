package com.algorithms.dynamicprogramming.memoization;

import java.util.HashMap;
import java.util.Map;

/*
 * Say that you are a traveler on a 2D grid. You begin in the top-left corner and your goal is to travel to the bottom-right corner. You may only move down or right.
 * 
 * In how many ways can you travel to the goal on a grid with dimensions m*n?
 * */

public class GridTraveler {

	public static long gridTraveler(int m, int n, Map<String, Long> memo) {
		String key = m + "," + n;
		if (memo.containsKey(key))
			return memo.get(key);
		if (m == 0 || n == 0)
			return 0;
		if (m == 1 && n == 1)
			return 1;
		long noOfWays = gridTraveler(m - 1, n, memo) + gridTraveler(m, n - 1, memo);
		memo.put(key, noOfWays);
		return noOfWays;
	}

	public static void main(String[] args) {
		Map<String, Long> memo = new HashMap<String, Long>();
		System.out.println(gridTraveler(1, 1, memo));
		System.out.println(gridTraveler(2, 3, memo));
		System.out.println(gridTraveler(3, 2, memo));
		System.out.println(gridTraveler(3, 3, memo));
		System.out.println(gridTraveler(18, 18, memo));
	}
}
