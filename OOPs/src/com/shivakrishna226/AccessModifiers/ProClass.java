package com.shivakrishna226.AccessModifiers;

public class ProClass {

	// ProStudent Class in Other Class named ProClass
	public static void main(String[] args) {

		ProStudent proStudent = new ProStudent();

		proStudent.printRollNo();
		System.out.println(proStudent.rollNo);
	}

}
