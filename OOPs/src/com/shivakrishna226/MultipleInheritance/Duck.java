package com.shivakrishna226.MultipleInheritance;

////public class Duck extends Flyable{
//public class Duck extends Swimmable {
//
//	public static void main(String[] args) {
//		Duck duck = new Duck();
//
////		duck.fly();
//		duck.swim();
//	}
//
//}

/*
 * we cannot achieve multiple inheritance at class level so we go for interfaces
 */

public class Duck implements Flyable, Swimmable {
	public static void main(String[] args) {
		
	Duck duck = new Duck();
	duck.fly();
	duck.swim();
	
	
}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Swimming . . .");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying . . .");
		
	}
}