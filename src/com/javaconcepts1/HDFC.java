package com.javaconcepts1;

public class HDFC extends GPay{
	
	public void transaction(int amount) {
		super.transaction(5000);
		double total = amount*1.05;
		System.out.println("Total : " + total);
	}
	
	public static void get() {
		System.out.println("child");
	}
	
	
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.transaction(500);
		GPay.get();
		get();
	}

}
