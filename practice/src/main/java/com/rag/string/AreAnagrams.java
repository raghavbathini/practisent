package com.rag.string;

public class AreAnagrams {

	public static void main(String[] args) {
		String s1 = "raghava";
		String s2 = "vaghart";
		
		System.out.println(areAnagrams(s1,s2));

	}
	
	static boolean areAnagrams(String s1, String s2) {
		
		if(s1.length()!= s2.length())
			return false;
		
		int chars[] = new int[256];
		
		for(int i=0; i<s1.length(); i++)
			chars[s1.charAt(i)]++;
		
		for(int i=0; i<s2.length(); i++)
			chars[s2.charAt(i)]--;
		
		for(int i=0; i<256; i++) {
			if(chars[i]!=0) {
				return false;
			}
		}
		
		return true;
	}

}
