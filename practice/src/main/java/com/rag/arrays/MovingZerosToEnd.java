package com.rag.arrays;

import java.util.Arrays;

public class MovingZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 0, 4, 2, 7, 0, 0, 1, 9, 4, 0, 0, 10 };
		int[] r = moveZeros(arr);
		System.out.println(Arrays.toString(r));
	}

	public static int[] moveZeros(int[] a) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[index++] = a[i];
			}
		}
		while (index < a.length) {
			a[index++] = 0;
		}
		return a;
	}

}
