package com.rag.string;

import java.util.regex.Pattern;

public class ReverseSentence {

	public static void main(String[] args) {
		String s = "Java is a programming language";
//		System.out.println("intitial size-->" + s.length());
//		String t = reverse(s);
//		String u = reverseWords(s);
		reverseWordInMyString(s);
//		System.out.println("reverse output--->"+ t);
//		System.out.println("reverseWords output--->" + u);
//		System.out.println("reverse final size-->"+ t.length());
//		System.out.println("reverseWords final size-->" + u.length());
	}

	public static String reverse(String s) {
		String[] words = s.split(" ");

		String outputString = "";

		for (int i = words.length - 1; i >= 0; i--) {
			outputString = outputString + words[i] + " ";
		}

		return outputString.trim();
	}

	// Method to reverse words of a String
	static String reverseWords(String str) {

		// Specifying the pattern to be searched
		Pattern pattern = Pattern.compile("\\s");

		// splitting String str with a pattern
		// (i.e )splitting the string whenever their
		// is whitespace and store in temp array.
		String[] temp = pattern.split(str);
		String result = "";

		// Iterate over the temp array and store
		// the string in reverse order.
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		return result;
	}

	static void reverseWordInMyString(String str) {
		/*
		 * The split() method of String class splits a string in several strings based
		 * on the delimiter passed as an argument to it
		 */
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				/*
				 * The charAt() function returns the character at the given position in a string
				 */
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

}
