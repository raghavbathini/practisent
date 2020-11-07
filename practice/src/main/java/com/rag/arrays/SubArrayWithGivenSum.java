package com.rag.arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int a[] = {1,4,20,3 ,10, 5};
		int sum=33;
		System.out.println(subArrayWithGivenSum(a,sum));

	}
	
	static boolean subArrayWithGivenSum(int a[], int sum) {
		int curr_sum = a[0]; 
		int s = 0;
		for(int e=1; e<a.length; e++) {
			while(curr_sum > sum && s<e-1) {
				curr_sum-= a[s];
				s++;
			}
			
			if(curr_sum == sum)
				return true;
			
			if(e<a.length)
				curr_sum+= a[e];

			}
		
		return(curr_sum == sum);
		}

}
