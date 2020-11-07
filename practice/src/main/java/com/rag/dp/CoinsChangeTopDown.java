package com.rag.dp;

import java.util.HashMap;
import java.util.Map;

class CoinsChangeTopDown
{
	// Function to find the total number of distinct ways to get change of N
	// from unlimited supply of coins in set S
	public static int count(int[] S, int n, int N, Map<String, Integer> lookup)
	{
		// if total is 0, return 1 (solution found)
		if (N == 0) {
			return 1;
		}

		// return 0 (solution do not exist) if total become negative or
		// no elements are left
		if (N < 0 || n < 0) {
			return 0;
		}

		// construct an unique map key from dynamic elements of the input
		String key = n + "|" + N;

		// if sub-problem is seen for the first time, solve it and
		// store its result in a map
		if (!lookup.containsKey(key))
		{
			// Case 1. include current coin S[n] in solution and recur
			// with remaining change (N - S[n]) with same number of coins
			int include = count(S, n, N - S[n], lookup);

			// Case 2. exclude current coin S[n] from solution and recur
			// for remaining coins (n - 1)
			int exclude = count(S, n - 1, N, lookup);

			// assign total ways by including or excluding current coin
			lookup.put(key, include + exclude);
		}

		// return solution to current sub-problem
		return lookup.get(key);
	}

	// Coin Change Problem
	public static void main(String[] args)
	{
		// n coins of given denominations
		int[] S = {2,3,5,10 };

		// Total Change required
		int N = 15;

		// create a map to store solutions of subproblems
		Map<String, Integer> lookup = new HashMap<>();

		System.out.print("Total number of ways to get desired change is "
								 + count(S, S.length - 1, N, lookup));
	}
}