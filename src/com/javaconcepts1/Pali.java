package com.javaconcepts1;

public class Pali {
	
	public static void main(String[] args) {
		String s = "Radar";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;--i) {
			rev = rev+s.charAt(i);
		}
		System.out.println(s.toLowerCase());
		System.out.println(rev.toLowerCase());
		if(s.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("Pali");
		}else {
			System.out.println("not pali");
		}
	}

}
