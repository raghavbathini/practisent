package com.rag.arrays;

public class MaxDiff {

	public static void main(String[] args) {
		int a[] = {2,3,10,6,4,8,1};
		int n = a.length;
		
		int res = a[1]-a[0];
		int min_element = a[0];
		
		for(int i=1; i<n; i++) {
			res = Math.max(res, a[i]-min_element);
			min_element = Math.min(min_element, a[i]);
				
		}
		
		System.out.println(res);
	}

}
