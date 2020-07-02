package com.lc;

public class ArrangingCoins {

	public int ArrangingCoins(int n) {
		
		//using mathematical formula sum of n numbers and quadratic equation
		return (int) (Math.sqrt(2*(long) n+0.25)-0.5);	
	}
}
