package com.algorithms.bitwise;

public class Binary {

	String getBinary(int num) {
		String binary = "";
		for (int i = (1 << 16); i > 0; i = i >> 1) {
			int bit = (num & i) == 0 ? 0 : 1;
			binary = binary + bit;
		}

		return binary;
	}

	public static void main(String args[]) {
		Binary ob = new Binary();
		int num = 10;
		String binary = ob.getBinary(num);
		System.out.println(String.format("Binary representation of %d: %s", num, binary));

		System.out.println(String.format("Binary representation of %d: %s", num, Integer.toBinaryString(num)));
	}
}
