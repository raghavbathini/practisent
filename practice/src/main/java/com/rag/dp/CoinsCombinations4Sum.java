package com.rag.dp;

public class CoinsCombinations4Sum {

	public static void main(String[] args) {
		int coins[] = {2,3,5,10};
		int sum = 15;
		
		maxinsub(coins, sum);
		
		

	}
	
	static void findCombinations(int coins[], int sum) {
		int a[][] = new int[coins.length][sum];
		for(int i=0; i<coins.length; i++)
			a[i][0] = 1;
		for(int j=1; j<sum; j++)
			a[0][j] = 0;
		for(int i=1; i<coins.length; i++) {
			for(int j=1; j<sum; j++) {
				if(coins[i] > sum) {
					a[i][j] = a[i-1][j];
				}else {
					a[i][j] = a[i-1][j]+a[i][j-coins[i]];
				}
			}
		}
		System.out.println(a[coins.length-1][sum-1]);
	}
	
	static void maxinsub(int[] coins,int amount){
	       int a[][] = new int[coins.length][amount+1];
	       for(int i=0;i<coins.length;i++){
	           for(int j=0;j<amount;j++){
	               if(i==0){
	                  if((j+1)%coins[i]==0)
	                  a[i][j]=1;
	                  else
	                  a[i][j]=0;
	               }else{
	              if(coins[i]>j+1)
	              a[i][j] = a[i-1][j];
	              else if(j+1-coins[i]==0)
	              a[i][j] = 1+a[i-1][j];
	              else if(j+1-coins[i]>0)
	              a[i][j] = a[i-1][j]+a[i][j-coins[i]];
	               }
	           }
	       }
	       
	       System.out.println(a[coins.length-1][amount-1]);
		
	}

}
