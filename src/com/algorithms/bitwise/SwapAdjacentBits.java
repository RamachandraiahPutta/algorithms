package com.algorithms.bitwise;

/*
 * swap adjacent bits in a number
 * 
 * Ex: 1100 0110 to 1100 1001
 * 
 * */
public class SwapAdjacentBits {
	int swapAdjacentBits(int num) {
		int evenMask = 0xAAAAAAAA; // it has even bits set in binary representation (1010 1010 1010 1010)
		int oddMask = 0x55555555; // it has odd bits set in binary representation   (0101 0101 0101 0101)
		int evenBits = num & evenMask; // contains all even bits in the number      (0000 0000 1000 0010)
		int oddBits = num & oddMask; // contains all odd bits in the number			(0000 0000 0100 0100)
		int result = evenBits >> 1 | oddBits << 1; //(0000 0000 0100 0001) | (0000 0000 1000 1000) = (0000 0000 1100 1001)

		return result;
	}
}
