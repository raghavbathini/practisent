package com.rag.hashcodeequals;

import java.util.HashSet;

public class hashcodeequalsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		
		System.out.println(s1.equals(s2));
		
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(s1);
		hs.add(s2);
		
		System.out.println(hs.size());
		

	}

}
