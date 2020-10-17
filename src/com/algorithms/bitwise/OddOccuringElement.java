package com.algorithms.bitwise;

/*
 * find odd occuring element in a array
 * 
 * Given an array of integeres, find odd number of times appearing element in the array
 * 
 * Input:  { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 }
 * Output: 4        as 4 appears 3 (which is odd number) times in the array
 * 
 * Logic: XOR operation
 * 
 * X^0 = X
 * X^X = 0
 * 
 * (X^X) ^ (X^X) = 0
 * (X^X) ^ X = 0 ^ X = X 
 * 
 * */

public class OddOccuringElement {
	int findOddOccuringElement(int[] array) {
		int element = 0;
		for (int i : array) {
			element = element ^ i;
		}
		return element;
	}

	public static void main(String args[]) {
		OddOccuringElement ob = new OddOccuringElement();
		int[] array = { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 };

		int result = ob.findOddOccuringElement(array);

		System.out.println(result);
	}
}
