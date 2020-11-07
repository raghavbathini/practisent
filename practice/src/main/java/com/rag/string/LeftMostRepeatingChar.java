package com.rag.string;

import java.util.Arrays;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
		String s = "zghavender";
		System.out.println(leftMostRepeatingChar(s));

	}
	
	static int leftMostRepeatingChar(String s) {
		int first_index[] = new int[256];
		Arrays.fill(first_index, -1);
		int n = s.length();
		int result = Integer.MAX_VALUE;
		
		for(int i=n-1; i>=0; i--) {
			if(first_index[s.charAt(i)]== -1) {
				first_index[s.charAt(i)] = i;
			}else {
				result = i;
			}
		}
		
		if(result == Integer.MAX_VALUE)
			return -1;
		else
			return result;
	}

}
