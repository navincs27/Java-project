package com.javaconcepts;

public class Payments extends Reliance{
	
	public void cosmetics() {
		System.out.println("pay by cash");
	}

	@Override
	public void speaker() {
		System.out.println("pay by cash");
	}
	@Override
	public void dress() {
		System.out.println("pay by card");
	}
	
	public static void main(String[] args) {
		Payments p = new Payments();
		p.speaker();
		p.dress();
		p.dress1();
		p.cosmetics();
		
		Reliance r = new Payments();
		r.speaker();
		r.dress();
		r.dress1();
		
		
		
		
	}
	
	

}
