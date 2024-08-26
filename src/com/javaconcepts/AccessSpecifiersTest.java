package com.javaconcepts;

public class AccessSpecifiersTest {
	
	public void getStudentId() {
		System.out.println("Public Method");
	}
	
	private void getStudentName() {
		System.out.println("Private method");
	}
	
	protected void getStudentAddress() {
		System.out.println("Protected Method");
	}
	
	void getStudentContact() {
		System.out.println("Default Method");
	}
	
	public static void main(String[] args) {
		AccessSpecifiersTest a = new AccessSpecifiersTest();
		a.getStudentAddress();
		a.getStudentContact();
		a.getStudentId();
		a.getStudentName();
	}

}
