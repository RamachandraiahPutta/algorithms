package com.algorithms.bitwise;

/*
 * set a bit in a number N
 * 
 * If we want to set a bit at nth position in number ‘num’ ,it can be done using ‘OR’ operator( | )
 * */
public class SetBit {

	int setBit(int N, int position) {
		return N | (1 << position);
	}

	public static void main(String args[]) {
		SetBit ob = new SetBit();
		int num = 8;

		int result = ob.setBit(num, 1);

		System.out.println(result);
	}
}
