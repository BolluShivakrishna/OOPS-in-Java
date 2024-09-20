package com.ciq.AccessModifiers;

public class PubVidyarthi extends PubStudent {

//PubStudent Class in SubClass(extended) Class named PubVidyarthi in Same Package

	public static void main(String[] args) {

		PubVidyarthi pubVidyarthi = new PubVidyarthi();

		pubVidyarthi.printRollNo();
		System.out.println(pubVidyarthi.rollNo);
	}

}
