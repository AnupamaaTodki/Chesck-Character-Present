package com.practiceproject;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeProjectt {

	public static ArrayList<String> characterIsPresent(ArrayList<String> list) {
		System.out.println("Enter the character to search");
		Scanner sc = new Scanner(System.in);
		String character = sc.nextLine();
		ArrayList<String> list2 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(character)) {
				list2.add(list.get(i));
			}
		}
		return list2;
	}

	public static void print(ArrayList<String> list) {
		ArrayList<String> containElement = characterIsPresent(list);
		if (containElement.size() != 0) {
			System.out.println("Alphabet is present in the string that are");
			for (String element : containElement) {
				System.out.println(element);
			}
		} else {
			System.out.println("Alphabet is not present in string");
		}
	}

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Anvesh");
		list.add("Aryan");
		list.add("Sandesh");
		list.add("vikas");

		print(list);
	}

}
