package com.rag.arrays;

public class RemoveDups4mSortedArray {

	public static void main(String[] args) {
		int a[] = {10,20,20,30,30,30,30};
		int b[] = {10,10,10};
		
		System.out.println(removeDups4mSortedArray(a));
		System.out.println(removeDups4mSortedArray(b));

	}
	
	static int removeDups4mSortedArray(int[] a) {
		int result = 1;
		int i = 1;
		while(i<a.length) {
			if(a[i-1] != a[result]) {
				a[result] = a[i];
				result++;
			}
			i++;
		}
		
		return result;
	}

}
