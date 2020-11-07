package com.rag.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	

	public static void main(String[] args) {
		String s[] = {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(s).forEach(System.out::println);



	}
	
    static List<List<String>> groupAnagrams(String[] strs) {
//        if (strs.length == 0) return new ArrayList();
        Map<String, List<String>> ans = new HashMap<String, List<String>>();
        for (String s : strs) {
        	List<String> val = new ArrayList<String>();
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
            	val.add(s);
            	ans.put(key, val);
            }else {
            	ans.get(key).add(s);
            }
            	
        }
        return new ArrayList<List<String>>(ans.values());
    }

}
