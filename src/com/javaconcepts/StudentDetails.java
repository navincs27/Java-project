package com.javaconcepts;

public class StudentDetails{
	
	
	
	public StudentDetails() {
		System.out.println("Parent");
	}
	
	public void getStudent() {
		System.out.println("Student");
	}
	
	public void getStudent(int id) {
		System.out.println("Student Id is : "+id);
	}
	
	public void getStudent(long age) {
		System.out.println("Age is : "+age);
	}
	
	public void getStudent(short salary) {
		System.out.println("salary is : "+salary);
	}
	
	public void getStudent(byte rollNo) {
		System.out.println("rollNo is : "+rollNo);
	}
	
	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		s.getStudent((short)345);
	}
	

}
