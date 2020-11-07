package com.rag.arrays;

public class MaxDifference {

	public static void main(String[] args) {
		int a[] = {2,3,10,6,4,8,1};
		int b[] = {7,9,5,6,3,2};
		int c[] = {10,20,30};
		int d[] = {30,10,8,2};
		
		System.out.println(maxdiff(a));
		System.out.println(maxdiff(b));
		System.out.println(maxdiff(c));
		System.out.println(maxdiff(d));

	}
	
	static int maxdiff(int a[]) {
		int result = a[1] - a[0];
		
		int min_val = a[0];
		
		for(int i=1; i<a.length; i++) {
			result = Math.max(result, a[i]-min_val);
			if(a[i] < min_val)
				min_val=a[i];
		}
		
		return result;
	}

}
