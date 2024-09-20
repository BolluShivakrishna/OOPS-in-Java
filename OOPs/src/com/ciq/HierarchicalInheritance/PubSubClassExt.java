package com.ciq.HierarchicalInheritance;

import com.ciq.AccessModifiers.PubStudent;

public class PubSubClassExt extends PubStudent {

//PubStudent Class in SubClass(extended) Class named PubSubClassExt in Different Package

	public static void main(String[] args) {
		PubSubClassExt pubSubClassExt = new PubSubClassExt();
		pubSubClassExt.printRollNo();
		System.out.println(pubSubClassExt.rollNo);

	}
}
