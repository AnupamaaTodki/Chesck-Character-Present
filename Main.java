package com.practiceproject;

interface Aa {
    void walk(); 
}
interface Bb {
    void walk();
}
class Main implements Aa,Bb{
	public void walk() {
		System.out.println("Animal will walk");
	}
	public static void main(String args[]) {
		Main main = new Main();
		main.walk();
		
	}
}