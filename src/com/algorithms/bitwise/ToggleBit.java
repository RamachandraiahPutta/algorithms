package com.algorithms.bitwise;

public class ToggleBit {

	int toggleBit(int N, int position) {
		return N^(1<<position);
	}

	public static void main(String args[]) {
		ToggleBit ob = new ToggleBit();
		int num = 10;
		System.out.println("Binary before toggle: "+Integer.toBinaryString(num));
		int result = ob.toggleBit(num, 2);
		System.out.println("Binary after toggle: "+Integer.toBinaryString(result));
	}
}
