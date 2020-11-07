package com.rag.arrays;

public class FrequenciesInSortedArry {

	public static void main(String[] args) {
		int a[] = {10,10,10,25,30,30};
		int b[] = {10,10,10,10};
		int c[] = {10, 20, 30};
		
		frequenciesInSortedArry(a);
		frequenciesInSortedArry(b);
		frequenciesInSortedArry(c);

	}
	
	static void frequenciesInSortedArry(int[] a) {
		
		int count =1; 
		int i = 1;
		
		while(i < a.length) {
			while(i< a.length && a[i] == a[i-1] ) {
				count++;
				i++;
			}
			System.out.println(a[i-1]+"---->"+count);
			i++;
			count = 1;
		}
		if(a[i-1] != a[i-2])
			System.out.println(a[i-1]+"---->"+count);
		
	}

}
