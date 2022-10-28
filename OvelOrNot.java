package com.practiceproject;

import java.util.Scanner;

public class OvelOrNot {
	public static void main(String args[]) {
		System.out.println("Enter the alphabet");
		Scanner scanner = new Scanner(System.in);
		char alphabet = scanner.next().charAt(0);
		if((alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') || 
	       (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')) {
			
		System.out.println("Given character is vowel");
		}
		
		else {
			System.out.println("given alphabet is consonant");
		}
	}
}
