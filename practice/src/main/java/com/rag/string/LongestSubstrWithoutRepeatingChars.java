package com.rag.string;

import java.util.HashSet;

public class LongestSubstrWithoutRepeatingChars {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(longestSubstrWithoutRepeatingChars(s));

	}
	
	static int longestSubstrWithoutRepeatingChars(String s) {
		int n = s.length();
		int l = 0;
		int r = 0;
		int result = Integer.MIN_VALUE;
		HashSet<Character> chars = new HashSet<Character>();
		while(r < n) {
			if(!chars.contains(s.charAt(r))) {
				chars.add(s.charAt(r));
				r++;
				result = Math.max(chars.size(), result);
			}else {
				chars.remove(s.charAt(l));
				l++;
			}
		}
		
		return result;
	}

}
