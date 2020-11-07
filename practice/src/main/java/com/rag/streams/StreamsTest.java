package com.rag.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsTest {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("raghav");
		l.add("kovidh");
		l.add("koushik");
		l.add("saritha");
		
//		l.forEach(t->System.out.println(t));
		l.stream().filter(t->t.startsWith("k")).forEach(t->System.out.println(t));
		

	}

}
