package com.javaconcepts1;

public class GPay extends Bank {

	@Override
	public void transaction(int amount) {

//		Bank b = new Bank();
//		b.transaction(200);

//		super.transaction(200);

		double total = amount * 0.99;
		System.out.println("Total is : " + total);
	}
	
	public static void get() {
		System.out.println("parent");
	}
	

	public static void main(String[] args) {
		GPay g = new GPay();
		g.transaction(100);

	}
}
