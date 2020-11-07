package com.rag.arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int a[] = {8,12,15};
		int b[] = {8,10,10,12};
		int c[] = {100};
		int d[] = {100,20,200};
		
		System.out.println(isArraySorted(a));
		System.out.println(isArraySorted(b));
		System.out.println(isArraySorted(c));
		System.out.println(isArraySorted(d));

	}
	
	static boolean isArraySorted(int[] a) {
		for(int i=1; i<a.length; i++) {
			if(a[i-1] > a[i]) {
				return false;
			}
				
		}
		
		
		
		return true;
	}

}
