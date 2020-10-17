package com.algorithms.bitwise;

public class PowerOfTwo {

	boolean isPowerOfTwo(int num) {
		return (num & num - 1) == 0;  // if number if power of 2, only 1 bit is set in it's binary representation
										// as we know n & n-1 will unset right most set bit, result would be 0
										// we can use (n & -n) == n logic also to validate isPowerofTwo
	}
	
	public static void main(String args[]) {
		PowerOfTwo ob = new PowerOfTwo();
		int num = 8;
		System.out.println(String.format("%d is power of 2: %b",num,ob.isPowerOfTwo(num)));
		num=10;
		System.out.println(String.format("%d is power of 2: %b",num,ob.isPowerOfTwo(num)));
	}

}
