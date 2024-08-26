package com.javaconcepts;

public class SingleInheritance extends AccessSpecifiersTest{
	
	public void getStudentDetails() {
		System.out.println("Child meth");
	}
	
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		//Accessing parent & child method with child object
		s.getStudentAddress(); //Parent
		s.getStudentDetails(); //Child
		
	}

}
