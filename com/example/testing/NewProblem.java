package com.example.testing;

public class NewProblem {
	public static void main(String[] args) {
		// [2,7,9,3,1]
		
		// 2 + 9 + 1
		
		// [2] -- 2
		
		// [2,5] == 5
		
		// [2,3,4]  = index[1] , Math.max(first,third)
		
		// [1,2,3,4] = finalAns[3], curr[4] + finalAns[1]
		
		int[] house = {2,7,9,3,1};
		int[] dp = new int[5];
		
		dp[0] = house[0];
		dp[1] = house[1];
		for(int i = 2 ; i < house.length; i ++) {
			dp[i] = Math.max(house[i] + dp[i-2] , dp[i-1]);
		}
		System.out.println(dp[house.length -1]);
	}
}
