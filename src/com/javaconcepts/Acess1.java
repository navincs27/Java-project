package com.javaconcepts;

public class Acess1 {
	
	public void getStudentEmail() {
		System.out.println("Public method 1");
	}
	
	public static void main(String[] args) {
		
		Acess1 a = new Acess1();
		a.getStudentEmail();
		
		AccessSpecifiersTest ac = new AccessSpecifiersTest();
		//Private cannot be accessed outside the class
		ac.getStudentAddress();
		ac.getStudentContact();
		ac.getStudentId();
		
		
	}

}
