package com.rag.arrays;

public class EquilibriamPoint {

	public static void main(String[] args) {
		int a[] = {3,4,8,-9,20,6};
		int b[] = {4,2,-2};
		int c[] = {4,2,2};
		
		System.out.println(equilibriumPoint(a));
		System.out.println(equilibriumPoint(b));
		System.out.println(equilibriumPoint(c));

	}
	
	static boolean equilibriumPoint(int a[]) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		
		int lsum=0;
		
		for(int i=0; i<a.length; i++) {
			if(lsum == sum-a[i])
				return true;
			lsum+=a[i];
			sum-=a[i];
		}
		
		return false;
	}

}
