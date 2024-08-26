package com.javaconcepts;

public class Stringtest {

	public void stringMethods(String s, String s1) {

//		System.out.println(s.equals(s1));
//		
//		int l = s.length();
//		
//		System.out.println(l);
//		
		String input = "Java is a programming lanuage";
		
		String[] words = input.split(" ");
		
		for(String a : words) {
			System.out.println(a);
		}
		
		
		for(int i=0;i<words.length;i++) {
			System.out.println("i");
		}
		
		
		
		
	}

	public String getPrice(String moneyType, double cost) {

		String price = moneyType + cost;
		return price;
	}

	public static void main(String[] args) {

		Stringtest st = new Stringtest();
		
	

		st.stringMethods("java", "Java");

		System.out.println(st.getPrice("Rs.", 345));
		
		st.stringMethods("Java", "Java");
	}

}
