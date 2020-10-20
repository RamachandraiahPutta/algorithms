package com.algorithms.dynamicprogramming;

public class DynamicProgramming {
	/*
	 * Dynamic Programming (DP) : Dynamic Programming (DP) is an algorithmic
	 * technique for solving an optimization problem by breaking it down into
	 * simpler subproblems and utilizing the fact that the optimal solution to the
	 * overall problem depends upon the optimal solution to its subproblems.
	 * 
	 * Characteristics of Dynamic Programming: what are the characteristics of a
	 * problem that tells us that we can apply DP to solve it.
	 * 
	 * 1) Overlapping Subproblems: Like Divide and Conquer, Dynamic Programming
	 * combines solutions to sub-problems. Dynamic Programming is mainly used when
	 * solutions of same subproblems are needed again and again
	 * 
	 * Subproblems are smaller versions of the original problem. Any problem has
	 * overlapping sub-problems if finding its solution involves solving the same
	 * subproblem multiple times.
	 * 
	 * In dynamic programming, computed solutions to subproblems are stored in a
	 * table so that these don’t have to be recomputed.
	 * 
	 * There are following two different ways to store the values so that these
	 * values can be reused:
	 * 
	 * a) Memoization (Top Down): The memoized program for a problem is similar to
	 * the recursive version with a small modification that it looks into a lookup
	 * table before computing solutions. We initialize a lookup array with all
	 * initial values as NIL. Whenever we need the solution to a subproblem, we
	 * first look into the lookup table. If the precomputed value is there then we
	 * return that value, otherwise, we calculate the value and put the result in
	 * the lookup table so that it can be reused later.
	 * 
	 * b) Tabulation (Bottom Up): The tabulated program for a given problem builds a
	 * table in bottom up fashion and returns the last entry from table.
	 * 
	 * In Memoized version, table is filled on demand while in Tabulated version,
	 * starting from the first entry, all entries are filled one by one. For some DP
	 * Problems all entries of lookup table are not necessarily filled. Ex: LCS
	 * (longest common subsequence) Problem
	 * 
	 * 2) Optimal Substructure Property: Any problem has optimal substructure
	 * property if its overall optimal solution can be constructed from the optimal
	 * solutions of its subproblems
	 * 
	 * 
	 * Steps to solve a DP
	 * 
	 * 1) Identify if it is a DP problem
	 * 
	 * 2) Decide a state expression with least parameters
	 * 
	 * 3) Formulate state relationship
	 * 
	 * 4) Do tabulation (or add memoization)
	 */
}
