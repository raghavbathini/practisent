package com.rag.persistent;

import java.util.Arrays;

public class Merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,6,9,10,12};
		int b[] = {1,3,7,11,15};
		int m = a.length;
		int n = b.length;
		int c[] = new int[m+n];
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < m && j < n) {
			if(a[i] < b[j]) {
				c[k] = a[i];
				i++;
			}else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
			
		while(j<n)
			c[k++] = b[j++];
		
		while(i<m)
			c[k++] = a[i++];
		
		System.out.println(Arrays.toString(c));
	}

}
