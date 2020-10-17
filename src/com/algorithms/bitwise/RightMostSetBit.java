package com.algorithms.bitwise;

public class RightMostSetBit {
	int turnOffRightMostSetBit(int num) {
		return num & (num - 1);
	}

	int rightMostSetBitPos(int num) {
		// if number is off return 1
		if ((num & 1) == 1)
			return 1;
		num = num ^ (num & (num - 1)); // num & (num-1) will turn off right most set bit
										// num ^ (num & (num-1)) will set only right most set bit

		int pos = 0;
		while (num != 0) {
			num >>= 1;
			pos++;
		}
		return pos;
	}

	public static void main(String args[]) {
		RightMostSetBit ob = new RightMostSetBit();
		int num = 20;

		System.out.println("Binary before clearing: " + Integer.toBinaryString(num));
		int result = ob.turnOffRightMostSetBit(num);
		System.out.println("Binary after clearing: " + Integer.toBinaryString(result));
		
		System.out.println("Position of rightmost set bit: "+ob.rightMostSetBitPos(num));
	}
}
