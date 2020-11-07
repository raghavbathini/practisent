package com.rag.arrays;

public class MaxSumOfKConsecutiveElements {

	public static void main(String[] args) {
		int a[] = {1,8,30,-5,20,7};
		int k=3;
		maxSumOfKConsecutiveElements(a,k);

	}
	
	static void maxSumOfKConsecutiveElements(int[] a, int k) {
		int sum = 0;
		for(int i=0; i<k; i++)
			sum+=a[i];
		int res = sum;
		for(int i=k; i<a.length; i++) {
			sum = sum-a[i-k]+a[i];
			res = Math.max(sum, res);
		}
		System.out.println(res);
	}

}
