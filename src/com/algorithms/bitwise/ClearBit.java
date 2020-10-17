package com.algorithms.bitwise;

public class ClearBit {

	int clearBit(int N, int position) {
		return N & ~(1 << position);
	}

	public static void main(String args[]) {
		ClearBit ob = new ClearBit();
		int num = 10;
		
		System.out.println("Binary before clearing: "+Integer.toBinaryString(num));
		int result = ob.clearBit(num, 1);
		System.out.println("Binary after clearing: "+Integer.toBinaryString(result));
	}

}
