package com.shivakrishna226.Inheritance2;

public class Airtel5g extends Airtel4g{
	public void unlimiteddata() {
		System.out.println("Airtel5g unlimiteddata");
	}
	public static void main(String[] args) {
		Airtel5g airtel5g =new Airtel5g();
		airtel5g.call();
		airtel5g.sms();
		airtel5g.internet();
		airtel5g.unlimitedcall();
		airtel5g.unlimiteddata();
	}
}
