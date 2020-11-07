package com.rag.string;

import java.util.Arrays;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "this is raghavender";
//		reverseEachWordsInString(s);
		System.out.println(reverseStringOfWords(s.toCharArray()));

	}
	
	static void reverseEachWordsInString(String s) {
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words));
		StringBuffer rev = new StringBuffer();
		for(String str: words) {
			rev.append(revString(str)+" ");
			
		}
		System.out.println(rev);
	}
	
	static String revString(String s) {
		int l = 0;
		int r = s.length()-1;
		char[] chars = new char[s.length()];
		chars = s.toCharArray();
		while(l<r) {
			Character temp = chars[l];
			chars[l] = chars[r];
			chars[r] = temp;
			l++;
			r --;
		}
		return String.valueOf(chars);
	}
	
	static char[] reverseStringOfWords(char[] s) {
		int n = s.length;
		int start=0;
		for(int end=0; end<n; end++) {
			if(s[end] == ' ') {
				reverse(s, start, end-1);
				start = end+1;
			}
		}
		reverse(s, start, n-1);
		reverse(s, 0, n-1);
		return s;
	}
	
	static void reverse(char s[], int l, int h) {
		Character temp;
		while(l<h) {
			temp = s[l];
			s[l] = s[h];
			s[h] = temp;
			l++; h--;
		}
	}

}
