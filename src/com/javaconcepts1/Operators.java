package com.javaconcepts1;

public class Operators {
	
	public void verifyOperators() {
		int a = 10;
		int b = 20;
		
		int c = a+b;
		System.out.println(c);
		
		int d = b-a;
		System.out.println(d);
		
		int e = a*b;
		System.out.println(e);
		
		int f = b/a;
		System.out.println(f);
		
		int g = b%a;
		System.out.println(g);
	}
	
	public void verifyCondition() {
		int marks = 56;
		int age = -89;
		if(marks != 50) {
			System.out.println("condition satisfied");
		}else {
			System.out.println("Not satisfied");
		}
		
		if(age == 18) {
			System.out.println("condition satisfied");
		}else {
			System.out.println("Not satisfied");
		}
		
		if(age > 18) {
			System.out.println("condition satisfied");
		}else {
			System.out.println("Not satisfied");
		}
		
		if(age < 18  && age >= 1) {
			System.out.println("Minor");
		}else if(age >= 18 && age <= 100) {
			System.out.println("Major");
		}else {
			System.out.println("Invalid age");
		}
	}
	
	public static void main(String[] args) {
		Operators op = new Operators();
		op.verifyOperators();
		op.verifyCondition();
	}
	

}
