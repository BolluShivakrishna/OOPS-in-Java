package com.shivakrishna226.MultipleInheritance;

public class BabyDuck extends  Duck{
	
	public void sound() {
		System.out.println("Baby Duck is Making sound");
		
	}
	
	public static void main(String[] args) {
		
		BabyDuck babyDuck=new BabyDuck();
		
		babyDuck.fly();
		babyDuck.swim();
		babyDuck.sound();
	}

}
