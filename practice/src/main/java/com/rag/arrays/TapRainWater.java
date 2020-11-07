package com.rag.arrays;

public class TapRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,0,6,2,3};
		int n = a.length;
		int res = 0;
		int lmax[] = new int[a.length];
		int rmax[] = new int[a.length];
		
		lmax[0]=a[0];
		for(int i=1; i<n; i++) {
			lmax[i]= Math.max(lmax[i-1], a[i]);
		}
		
		rmax[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--) {
			rmax[i] = Math.max(rmax[i+1], a[i]);
		}
		
		for(int i=1; i<n-1; i++)
			res = res + Math.min(lmax[i], rmax[i]-a[i]);
			
		System.out.println(res);	

	}

}
