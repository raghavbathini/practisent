package com.rag.arrays;

public class LongestEOSubArray {

	public static void main(String[] args) {
		int a[] = {10,12,14,7,8};
		int b[] = {7,10,13,14};
		int c[] = {10, 12, 8, 14};
		int d[] = {5,10,20,6,3,8};
		
		longestEOSubArray(a);
		longestEOSubArray(b);
		longestEOSubArray(c);
		longestEOSubArray(d);

	}
	
	static void longestEOSubArray(int a[]) {
		int n = a.length;
		int res = 1;
		int curr = 1;
		for(int i=1; i<n; i++) {
			if( a[i]%2==0 && a[i-1]%2!=0 ||  a[i]%2!=0 && a[i-1]%2==0 ) {
				curr++;
				res = Math.max(curr, res);
			}
				
			else
				curr=1;
		}
		
		System.out.println(res);
	}

}
