package com.javaconcepts1;

import com.javaconcepts.SingleInheritance;

public class MultilevelInheritance extends SingleInheritance{
	
	public void getStudentMarks() {
		System.out.println("multilevel child");
	}
	
	public void get() {
		this.getStudentMarks();
	}
	
	public static void main(String[] args) {
		MultilevelInheritance m = new MultilevelInheritance();
		m.get();
		
		
	}

}
