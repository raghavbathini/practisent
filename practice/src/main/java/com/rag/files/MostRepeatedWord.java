package com.rag.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MostRepeatedWord {

	public static void main(String[] args) {
		String current_line;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("D:\\Users\\rbathini\\practice\\practice\\src\\main\\java\\com\\rag\\files\\test.txt"));
			current_line = reader.readLine();
			while(current_line!= null) {
				String[] words = current_line.split(" ");
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
