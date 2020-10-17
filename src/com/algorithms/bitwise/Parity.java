package com.algorithms.bitwise;

/*
 * no of set bits in a number
 * 
 * Input: 52 (Binary of 52: 0011 0100)
 * Ouput: 3
 * 
 * Complexity:
 * naive approach requires one iteration for bit: O(no of bits)
 * 
 * Brian Kernighan's Approach will iterate over set bits only:O(no of set bits) 
 * 
 * */

public class Parity {

	int getParity(int num) {
		int count = 0;
		while (num > 0) {
			num = num & (num - 1); // we know num & (num-1) will turn off right most set bit
			count++;
		}
		return count;
	}

	public static void main(String args[]) {
		Parity ob = new Parity();
		int num = 52;
		System.out.println(String.format("Binary representation of %d: %s", num, Integer.toBinaryString(num)));
		System.out.println(String.format("Parity of %d: %d", num, ob.getParity(num)));
	}
}
