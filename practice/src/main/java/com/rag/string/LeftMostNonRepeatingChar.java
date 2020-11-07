package com.rag.string;

import java.util.Arrays;

public class LeftMostNonRepeatingChar {

	public static void main(String[] args) {
		String s = "zzgghhaavvender";
		System.out.println(leftMostNonRepeatingChar(s));

	}
	
	static int leftMostNonRepeatingChar(String s) {
		int first_index[] = new int[256];
		Arrays.fill(first_index, -1);
		int result = Integer.MAX_VALUE;
		
		for(int i=0; i<s.length(); i++) {
			if(first_index[s.charAt(i)]== -1) {
				first_index[s.charAt(i)] = i;
			}else {
				first_index[s.charAt(i)] = -2;
			}
		}
		
		for(int i=0; i<256; i++) {
			if(first_index[i] >= 0) {
				result = Integer.min(result, first_index[i]);
			}
		}
		
		if(result == Integer.MAX_VALUE)
			return -1;
		else
			return result;
	}

}
