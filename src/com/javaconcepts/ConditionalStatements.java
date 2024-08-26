package com.javaconcepts;

public class ConditionalStatements {
	
	public void verifyIfStatements() {
		int age = 269999;
		if(age >= 18) {
			System.out.println("Major");
		}
	}
	
	public void verifyIfElse() {
		int age = -452;
		if((age >= 18)&&(age <= 100)) {
			System.out.println("Major");
		}else {
			System.out.println("Minor");
		}
	}
	
	public void verifyElseIf() {
		int age = -4235234;
		if((age >= 18)&&(age <= 100)) {
			System.out.println("Major");
		}else if((age >= 1)&&(age < 18)){
			System.out.println("Minor");
		}
		else {
			System.out.println("Invalid age");
		}
	}
	
	public static void main(String[] args) {
		ConditionalStatements c = new ConditionalStatements();
//		c.verifyIfStatements();
//		c.verifyIfElse();
		c.verifyElseIf();
	}

}

// 1 to 5 -- child
//6 to 17 -- minor
//18 to 59 - Major
//60 to 100 - Senior citizen
//others - Invalid age









