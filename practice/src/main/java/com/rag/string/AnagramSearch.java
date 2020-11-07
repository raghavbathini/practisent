package com.rag.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramSearch {

	public static void main(String[] args) {
//		String s = "cbaebabacd";
//		String p = "abc";
		String s = "abab";
		String p = "ab";
		
		System.out.println(anagramSearch(s,p));
		countanagrams(s,p).forEach(System.out::print);
	}
	
	static boolean anagramSearch(String s, String p) {
		int s_len = s.length();
		int p_len = p.length();
		
		int s_chars[] = new int[256];
		int p_chars[] = new int[256];
		
		for(int i=0;i<p_len;i++) {
			s_chars[s.charAt(i)]++;
			p_chars[p.charAt(i)]++;
		}
		
		if(Arrays.equals(s_chars, p_chars))
			return true;
		
		for(int i=p_len; i<s_len; i++) {
			s_chars[s.charAt(i-p_len)]--;
			s_chars[s.charAt(i)]++;
			if(Arrays.equals(s_chars, p_chars)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	static List<Integer> countanagrams(String s, String p) {
		int count = 0;
		List<Integer> l = new ArrayList<Integer>();
		int s_len = s.length();
		int p_len = p.length();
		
		int s_chars[] = new int[256];
		int p_chars[] = new int[256];
		
		for(int i=0;i<p_len;i++) {
			s_chars[s.charAt(i)]++;
			p_chars[p.charAt(i)]++;
		}
		
		if(Arrays.equals(s_chars, p_chars)) {
			count++;
			l.add(0);
		}
			
		
		for(int i=p_len; i<s_len; i++) {
			s_chars[s.charAt(i-p_len)]--;
			s_chars[s.charAt(i)]++;
			if(Arrays.equals(s_chars, p_chars)) {
				count++;
				l.add(i-p_len+1);
			}
		}
		
		System.out.println(count);
		return l;
	}


}
