package com.practiceproject;

interface A{
	public default void show() {
		System.out.println("Welcome");
	}
}

interface b{
	public default void show() {
		System.out.println("to java");
	}
}

public class InterfaceMultipleInheritance implements A,b{
	public void show() {
		A.super.show();
		b.super.show();
	
	}
	public static void main(String args[]) {
			InterfaceMultipleInheritance test = new InterfaceMultipleInheritance();
			test.show();
	}
}


