package com.shivakrishna226.SingleInheritance;

public class Jio5g extends Jio4g {
	public void unLimited5gData() {
		System.out.println("Jio Unlimited 5g Data");
	}

	public void unLimitedCalling() {
		System.out.println("Jio Unlimited 5g Calling");
	}

	public static void main(String[] args) {
		Jio5g jio5g = new Jio5g();
		jio5g.Calling();
		jio5g.sms();
		jio5g.data();
		jio5g.unlimitedData();
		jio5g.unLimited5gData();
		jio5g.unLimitedCalling();
	}

}
