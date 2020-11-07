package com.rag.arrays;

public class Leaders {

	public static void main(String[] args) {
		int a[] = {7,10,4,10,6,5,2};
		int n = a.length;
		
		int cl = a[n-1];
		System.out.println("current leader is-->"+cl);
		for(int i=n-2; i>=0; i--) {
			if(a[i] > cl) {
				cl = a[i];
				System.out.println("current leader is-->"+cl);
			}
				
		}

	}

}
