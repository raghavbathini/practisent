package com.rag.arrays;

public class RemoveDupsFromSorted {

	public static void main(String[] args) {
		int a[] = {10,20,20,30,30,30};
		
		int res = 1;
		
		for(int i=1; i<a.length; i++) {
			if(a[i] != a[res-1]) {
				a[res] = a[i];
				res++;
			}
		}
		System.out.println(res);
	}

}
