package com.rag.arrays;

public class TappingRainWater {

	public static void main(String[] args) {
		int a[] = {2,0,2};
		int b[] = {3,0,1,2,5};
		int c[] = {5, 0, 6, 2, 3};
		
		rainwater(a);
		rainwater(b);
		rainwater(c);

	}
	
	static void rainwater(int []a) {
		int[] l_max= new int[a.length];
		int[] r_max= new int[a.length];
		int n = a.length;
		int storage = 0;
		
		l_max[0] = a[0];
		for(int i=1; i<n; i++)
			l_max[i] = Math.max(l_max[i-1],a[i]);
		
		r_max[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--)
			r_max[i] = Math.max(r_max[i+1], a[i]);
		
		for(int i=1; i<n-1; i++) {
			storage+= Math.min(l_max[i], r_max[i]) - a[i];
		}
		
		System.out.println("Max storage is--->"+ storage);
	}

}
