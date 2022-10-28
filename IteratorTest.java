package com.practiceproject;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("anu");
		list.add("adi");
		list.add("Arya");
		
		Iterator<String> iterator = list.iterator();
		
		System.out.println(iterator.next());
	}

}
