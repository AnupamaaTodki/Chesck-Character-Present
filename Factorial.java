package com.practiceproject;

public class Factorial {
	public static void main(String args[]) {
		int n = 8;
		int factorial = 1;
		for(int i = 1; i <= n; i++ ) {
			factorial = factorial * i;
			
		}
		System.out.println("the factorial of "+n+" is "+factorial);
	}

}
