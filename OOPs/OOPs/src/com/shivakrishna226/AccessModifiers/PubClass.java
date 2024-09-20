package com.shivakrishna226.AccessModifiers;

public class PubClass {


	//PubStudent Class in Other Class named PubClass
	public static void main(String[] args) {

		PubStudent pubStudent = new PubStudent();

		pubStudent.printRollNo();
		System.out.println(pubStudent.rollNo);
	}

}
