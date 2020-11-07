package com.rag.arrays;

public class MaxConsecutive1s {

	public static void main(String[] args) {
		int a[] = {0,1,1,0,1,0};
		int b[] = {1,1,1,1};
		int c[] = {0,0,0};
		int d[] = {1,0,1,1,1,1,0,1,1};
		
		maxConsecutive1s(a);
		maxConsecutive1s(b);
		maxConsecutive1s(c);
		maxConsecutive1s(d);

	}
	
	static void maxConsecutive1s(int a[]) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == 1) {
				count++;
				max = Math.max(max, count);
			}else {
				count = 0;
			}
			
			
		}
		
		System.out.println(max);
	}

}
