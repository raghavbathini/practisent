package com.rag.arrays;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int a[] = {2,3,-8,7,-1,2,3};
		int b[] = {5,8,3};
		int c[] = {-6,-1,-8};
		int d[] = {1,-2,3,-1,2};
		
		maxSumSubArray(a);
		maxSumSubArray(b);
		maxSumSubArray(c);
		maxSumSubArray(d);
		
		effmaxSumSubArray(a);
		effmaxSumSubArray(b);
		effmaxSumSubArray(c);
		effmaxSumSubArray(d);

	}
	
	static void maxSumSubArray(int a[]) {
		int max_sum = a[0];
		
		for(int i=0; i<a.length; i++) {
			int sum = 0;
			for(int j=i; j<a.length; j++) {
				sum = sum+a[j];
				if(sum > max_sum) {
					max_sum = sum;
				}
			}
		}
		
		System.out.println("max sum is---->"+ max_sum);
	}
	
	
	static void effmaxSumSubArray(int a[]) {
		int res = a[0];
		int maxending = a[0];
		
		for(int i=1; i<a.length; i++) {
			maxending = Math.max(maxending+a[i], a[i]);
			res = Math.max(res, maxending);
		}
		
		System.out.println("max sum is---->"+ res);
	}

}
