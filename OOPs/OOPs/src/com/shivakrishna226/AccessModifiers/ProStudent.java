package com.shivakrishna226.AccessModifiers;

public class ProStudent {

	// Actual Class named ProStudent

	protected int rollNo = 2;

	protected ProStudent() {
		rollNo = 26;
	}

	protected void printRollNo() {
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		ProStudent proStudent = new ProStudent();
		proStudent.printRollNo();
		System.out.println(proStudent.rollNo);
	}
}
