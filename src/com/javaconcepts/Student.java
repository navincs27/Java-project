package com.javaconcepts;

public class Student extends StudentDetails{
	//Default Constructor
//	public Student() {
//		
//	}	
	//Paramterized Constructor
	public Student(String name) {
		System.out.println(name);
	}
	
	//Non Parameterized Constructor
	public Student() {
		System.out.println("Student");
	}

	
	public Student(int a) {
		System.out.println(a);
	}
	public void getData() {
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		Student s = new Student(23);
		s.getData();
		s.getStudent(567);
	}
}
