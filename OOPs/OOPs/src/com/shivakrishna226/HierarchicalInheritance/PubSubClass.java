package com.shivakrishna226.HierarchicalInheritance;

import com.shivakrishna226.AccessModifiers.PubStudent;

public class PubSubClass {

	// PubStudent Class in SubClass(Not extended) Class named PubSubClass in Different
	// Package

	public static void main(String[] args) {

		PubStudent pubStudent = new PubStudent();
		pubStudent.printRollNo();
		System.out.println(pubStudent.rollNo);

	}
}
