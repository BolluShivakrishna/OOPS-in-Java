package com.ciq.AccessModifiers;

public class PriClass {
	// PriStudent Class in Other Class named PriClass
	public static void main(String[] args) {

		PriStudent priStudent = new PriStudent();

//			priStudent.printRollNo();
//			System.out.println(priStudent.rollNo);
	}

//	Since the access modifier is private we cant invoke private
//	members (variables, constructors, methods) in other classes

}
