package com.shivakrishna226.HierarchicalInheritance;

import com.shivakrishna226.AccessModifiers.PubStudent;

public class PubSubClassExt extends PubStudent {

//PubStudent Class in SubClass(extended) Class named PubSubClassExt in Different Package

	public static void main(String[] args) {
		PubSubClassExt pubSubClassExt = new PubSubClassExt();
		pubSubClassExt.printRollNo();
		System.out.println(pubSubClassExt.rollNo);

	}
}
