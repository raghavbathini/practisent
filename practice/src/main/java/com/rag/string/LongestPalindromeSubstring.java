package com.rag.string;

public class LongestPalindromeSubstring {
	static int start;
	static int len;
	static int count;

	public static void main(String[] args) {
		String s = "zxabcdcbaxhyzk";

		findLongestPalindrome(s);

	}
	
	static void findLongestPalindrome(String s) {
		for(int i=0; i< s.length();i++) {
			findPalindrome(s, i, i);
			findPalindrome(s, i, i+1);
		}
//		System.out.println(s.substring(start, start+len));
		System.out.println("Num of palindromes are-->"+ count);
	}
	
	private static void findPalindrome(String s, int begin, int end){
		int n =  s.length();
		int curr_len;
		while(begin>=0 && end<n && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
			count++;
		}
		
		curr_len = end - begin - 1;
		if(curr_len > len) {
			len = curr_len;
			start = begin+1;
		}

	}
	
	

}
