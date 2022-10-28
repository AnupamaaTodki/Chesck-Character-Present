package com.practiceproject;

import java.io.FileWriter;
import java.io.IOException;
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

	public static void print(ArrayList<String> list) throws IOException {
		ArrayList<String> containElement = characterIsPresent(list);
		if (containElement.size() != 0) {
			System.out.println("Alphabet is present in the string that are");
			for (String element : containElement) {
				System.out.println(element);
			}
		} else {
			System.out.println("Alphabet is not present in string");
		}
		FileWriter writer = new FileWriter("C:\\Users\\dell\\fileCheck");
		writer.write(containElement.toString());
		writer.close();
	}

	public static void main(String args[]) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		list.add("Anvesh");
		list.add("Aryan");
		list.add("Savanth");
		list.add("vikas");
		list.add("Sanya");
		list.add("Manvita");
		list.add("Chandini");

		print(list);
	}
}
