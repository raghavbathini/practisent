package com.rag.arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int a[] = {8,5,0,10,0,20};
		int c[] = {0,0,0,10,0};
		int d[] = {10,20};
		
		moveZeroesToEnd(a);
		moveZeroesToEnd(c);
		moveZeroesToEnd(d);
	}
	
	static void moveZeroesToEnd(int a[]) {
		int index = 0;
		int i;
		for(i=0; i<a.length; i++) {
			if(a[i] != 0) {
				a[index] = a[i];
				index++;
			}
		}
		
		for(int j=index; j<a.length; j++)
			a[j] = 0;
		
		System.out.println(Arrays.toString(a));
	}
	
	

}
