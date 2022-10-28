package com.practiceproject;

public class SeperateArray {
	public static void main(String args[]) {
		int input[] = { 0, 1, 0, 1, 0, 1, 0, 1 };

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 1) {
				System.out.println(input[i] + ",");
			}
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				System.out.println(input[i] + ",");
			}
		}
	}
}
