package com.rag.lambda;

@FunctionalInterface
interface FI{
	public String concate(String s1, String s2);
}

public class LambdaTest {

	public static void main(String[] args) {
		FI fi = (String s1, String s2) -> { System.out.println("concating 2 strings");
		return (s1+s2);
		};
		System.out.println(fi.concate("raghav", "reddy"));

	}

}
