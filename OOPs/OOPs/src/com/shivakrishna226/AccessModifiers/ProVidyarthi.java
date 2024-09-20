package com.shivakrishna226.AccessModifiers;

public class ProVidyarthi extends ProStudent {

//ProStudent Class in SubClass(extended) Class named ProVidyarthi in Same Package

	public static void main(String[] args) {

		ProVidyarthi proVidyarthi = new ProVidyarthi();

		proVidyarthi.printRollNo();
		System.out.println(proVidyarthi.rollNo);
	}

}
