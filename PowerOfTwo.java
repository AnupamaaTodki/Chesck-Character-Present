package com.practiceproject;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String args[]) {
		int result = 0;
		System.out.println("Enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if (n > 0) {
			result = n * n;
		} else {
			System.out.println("Enter the valid number");
		}
		System.out.println("the power of " + n + " is " + result);
	}

}