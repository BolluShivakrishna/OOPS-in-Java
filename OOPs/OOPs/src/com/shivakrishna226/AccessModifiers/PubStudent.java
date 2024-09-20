package com.shivakrishna226.AccessModifiers;

public class PubStudent {
	
	//Actual Class named PubStudent

	public int rollNo = 2;

	public PubStudent() {
		rollNo = 26;
	}

	public void printRollNo() {
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		PubStudent pubStudent= new PubStudent();
		pubStudent.printRollNo();
		System.out.println(pubStudent.rollNo);
	}
}
