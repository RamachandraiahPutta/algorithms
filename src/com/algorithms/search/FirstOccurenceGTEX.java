package com.algorithms.search;

import java.util.Arrays;
import java.util.List;

/*
 * Find the First and Last Position of X in a Sorted Array
 * 
 * Using Linearsearch we can do that in O(N) time, but with BinarySearch we can achieve that in O(log N) time
 * 
 * Input: [2,3,6,7,7,8,8,8,12]
 * Output: [5,7]
 * */
public class FirstOccurenceGTEX {

	int firstOccurencegteX(List<Integer> list, int x) {
		int size = list.size();
		int first_pos = size; // position of first occurrence of >=x
		int low = 0, high = size - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (list.get(mid) >= x) {
				first_pos = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return first_pos;
	}

	// Driver method to test above
	public static void main(String args[]) {
		FirstOccurenceGTEX ob = new FirstOccurenceGTEX();
		List<Integer> list = Arrays.asList(2, 3, 6, 7, 7, 8, 8, 8, 12);
		int x = 8;
		int first_pos = ob.firstOccurencegteX(list, x);
		int last_pos = ob.firstOccurencegteX(list, x + 1)-1;
		if (first_pos<last_pos) {
			System.out.println(String.format("First and Last Occurences of %d : [%d,%d]", x, first_pos, last_pos));
		}else {
			System.out.println(String.format("First and Last Occurences of %d : [%d,%d]", x, -1, -1));
		}

	}
}
