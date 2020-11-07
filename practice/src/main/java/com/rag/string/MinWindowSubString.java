package com.rag.string;

import java.util.HashMap;

public class MinWindowSubString {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";

		System.out.println(minWindowSubstring(s, t));

	}

	static String minWindowSubstring(String s, String t) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// pattern map
		for (Character ch : t.toCharArray()) {
			if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			} else {
				int val = hm.get(ch);
				hm.put(ch, val + 1);
			}
		}

		int count = 0;
		int start = 0;
		int min_length = Integer.MAX_VALUE;
		int min_left = 0;

		// increment count
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
				if (hm.get(s.charAt(i)) >= 0) {
					count++;
				}

			}

			while (count == t.length()) {
				if (min_length > i - start + 1) {
					min_length = i - start + 1;
					min_left = start;
				}

				if (hm.containsKey(s.charAt(start))) {
					hm.put(s.charAt(start), hm.get(s.charAt(start)) + 1);
					if (hm.get(s.charAt(start)) > 0) {
						count--;
					}
				}

				start++;

			}
		}
		if (min_length > s.length())
			return "";
		return s.substring(min_left, min_left + min_length);
	}
}
