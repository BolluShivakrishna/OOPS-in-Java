package com.ciq.SingleInheritance;

public class Dog extends Animal {
	public void Bark() {
		System.out.println("Dog is barking . . .");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.Bark();
	}
// here dog class is a Child class and Animal class is a parent class
// the single inheritance and multilevel inheritances both uses
// same procedure where Puppy class is a child and Dog class is a parent
}
