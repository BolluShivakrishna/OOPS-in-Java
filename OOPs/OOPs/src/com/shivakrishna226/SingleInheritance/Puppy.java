package com.shivakrishna226.SingleInheritance;

public class Puppy extends Dog {

	public void weep() {
		System.out.println("Puppy Weeps");
	}

	public static void main(String[] args) {
		Puppy puppy = new Puppy();

		puppy.eat();
		puppy.Bark();
		puppy.weep();
	}
	// Puppy Child to Dog
	// Dog Child to Animal --------> Single Inher

//	Line 17 and 16 at a time ------> Multilevel Inher
}
