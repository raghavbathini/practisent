package com.rag.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintingDuplicateCharacters {

    public static void main(String[] args) {
            String s="hcl-tech";
            printDupes(s);
            

    }
    public static void printDupes(String s)
    {
            char[] c=s.toCharArray();
            Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
            for(int i=0;i<c.length;i++)
            {
                    map.put(c[i], map.getOrDefault(c[i], 0)+1);
            }
            for(Map.Entry<Character,Integer> m : map.entrySet())
            {
                    if(m.getValue()>1)
                    {
                            System.out.println(m.getKey()+" --> "+m.getValue());
                    }
            }
    }
    

}
