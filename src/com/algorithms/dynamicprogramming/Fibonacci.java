package com.algorithms.dynamicprogramming;

/*
 * Get nth Fibonacci number
 * 	
 * 1) Recursive  				O(2^N)
 * 2) Memoization (Top Down)	O(N)
 * 3) Tabulation (Bottom Up)	O(N)
 * 
 * */
public class Fibonacci {

	int fibRecursion(int n) {
		if (n <= 1)
			return n;
		return fibRecursion(n - 1) + fibRecursion(n - 2);
	}

	final int MAX = 100;
	final int NIL = -1;

	int lookup[] = new int[MAX];

	/* Function to initialize NIL values in lookup table */
	void _initialize() {
		for (int i = 0; i < MAX; i++)
			lookup[i] = NIL;
	}

	int fibMemoization(int n) {
		if (lookup[n] == NIL) {
			if (n <= 1)
				lookup[n] = n;
			else
				lookup[n] = fibMemoization(n - 1) + fibMemoization(n - 2);
		}
		return lookup[n];
	}

	int fibTabulation(int n) {
		int f[] = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++)
			f[i] = f[i - 1] + f[i - 2];
		return f[n];
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f._initialize();
		int n = 44;
		
		System.out.printf("%dth Fibonacci number using Tabulation is: %d \n", n, f.fibTabulation(n));
		System.out.printf("%dth Fibonacci number using Memoization is: %d \n", n, f.fibMemoization(n));
		System.out.printf("%dth Fibonacci number using Recursion is: %d \n", n, f.fibRecursion(n));
		
		
	}

}
