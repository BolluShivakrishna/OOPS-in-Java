package com.shivakrishna226.AccessModifiers;

public class PriStudent {
//	private class PriStudent { // A class cant be private 

	// Actual Class named PriStudent

	private int rollNo = 2;

	public PriStudent() {
		rollNo = 26;
	}

	private void printRollNo() {
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		PriStudent priStudent = new PriStudent();
		priStudent.printRollNo();
		System.out.println(priStudent.rollNo);
	}
}
