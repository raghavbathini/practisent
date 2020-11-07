package com.rag.arrays;

public class FrequenciesInSortedArray {

	public static void main(String[] args) {
		int a[] = {10,10,10,25,30,30};
		int n = a.length;
		int freq = 1; 
		int i = 1;
		while(i < n) {
			while(i< a.length && a[i]==a[i-1]) {
				freq++;
				i++;
			}
			System.out.println(a[i-1]+"--->"+freq);
			freq = 1;
			i++;
		}

	}

}
