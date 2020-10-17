package com.algorithms.bitwise;

public class RoundToNextHighestPowOfTwo {
	int nextPowerof2(int num) {
		num = num - 1;
		while ((num & num - 1) != 0) {
			num = num & num - 1;
		}
		return num << 1;
	}

	public static void main(String args[]) {
		RoundToNextHighestPowOfTwo ob = new RoundToNextHighestPowOfTwo();
		int num = 28;
		int result = ob.nextPowerof2(num);
		System.out.println(String.format("Binary representation of %d: %s", num, Integer.toBinaryString(num)));
		System.out.println(String.format("Next Power of 2 for number %d: %d", num, result));
		System.out.println(String.format("Binary representation of %d: %s", result, Integer.toBinaryString(result)));
	}
}
