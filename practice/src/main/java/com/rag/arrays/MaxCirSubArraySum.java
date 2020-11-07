package com.rag.arrays;

public class MaxCirSubArraySum {

	public static void main(String[] args) {
		int a[] = {10,5, -5};
		int b[] = {5,-2,3,4};
		int c[] = {2,3,-4};
		int d[] = {8,-4,3,-5,4};
		int e[] = {-3,4, 6, -2};
		int f[] = {-8,7,6};
		int g[] = {3,-4,5,6,-8,7};
		
		maxCirSubArraySum(a);
		maxCirSubArraySum(b);
		maxCirSubArraySum(c);
		maxCirSubArraySum(d);
		maxCirSubArraySum(e);
		maxCirSubArraySum(f);
		maxCirSubArraySum(g);
		

	}
	
	static void maxCirSubArraySum(int[] a) {
		int n = a.length;
		int curr_sum;
		int curr_max;
		int index;
		int res = a[0];
		
		for(int i=0; i<n;i++) {
			curr_sum = a[i];
			curr_max = a[i];
			for(int j=1; j<n; j++) {
				index = (i+j) % n;
				curr_sum+= a[index];
				curr_max = Math.max(curr_sum, curr_max);
			}
			
			res = Math.max(curr_max, res);
		}
		
		System.out.println(res);
	}

}
