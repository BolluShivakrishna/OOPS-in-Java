package com.shivakrishna226.HierarchicalInheritance;

import com.shivakrishna226.AccessModifiers.ProStudent;

public class ProSubClassExt extends ProStudent {

//ProStudent Class in SubClass(extended) Class named ProSubClassExt in Different Package

	public static void main(String[] args) {
		ProSubClassExt proSubClassExt = new ProSubClassExt();
		proSubClassExt.printRollNo();
		System.out.println(proSubClassExt.rollNo);

	}
}
