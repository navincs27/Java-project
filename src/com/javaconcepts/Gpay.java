package com.javaconcepts;

public class Gpay extends Payments{

	public void getPayment(int price) {
		
//		Payments p = new Payments();
//		p.getPayment(230);
//		
	
		price = price - 10;
		System.out.println("Price is :" + price);
		
		
		super.getPayment(45);
		super.getPayment("qwerwer");
	}
	
	public static void main(String[] args) {
		Gpay g = new Gpay();
		g.getPayment(230);
		
		
//		Payments p = new Payments();
//		p.getPayment(230);
	}
}
