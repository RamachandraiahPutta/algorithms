package com.algorithms.bitwise;

public class GetBit {
	int getBit(int N, int position) {
		return (N & (1 << position)) == 0 ? 0 : 1;
	}

	public static void main(String args[]) {
		GetBit ob = new GetBit();
		int num = 10, position = 1;
		int result = ob.getBit(num, position);
		System.out.println(String.format("Bit at position %d in number %d: %d", position, num, result));
	}
}
