package com.rag.arrays;

import java.util.Arrays;

public class LeftRotateByK {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(a));
		int n = a.length;
		int k =3;
		int temp[] = new int[k];
		
		for(int i=0; i<k; i++)
			temp[i] = a[i];
		
		for(int i=k; i<n; i++)
			a[i-k] = a[i];
		
		for(int i=0; i<k; i++)
			a[n-k+i] = temp[i];
		
		System.out.println(Arrays.toString(a));
	}
	
	

}
