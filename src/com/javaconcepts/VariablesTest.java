package com.javaconcepts;

public class VariablesTest {
	//Class variable with initialization
	String name = "navin";
	//Class variable without initialization
	String input;
	int num;
	
	//Static variable with initialization
		static String name1 = "Sel";
		//Static  variable without initialization
		static String input1;
		static int num1;
		//Final variable with initialization
		final String data = "new";
	
	public void classVariableTest() {
		//Final variable cannot be reassigned
	//	data = "qweqw";
		
		//Creating final variable as local variable
		final int number = 34;
		
		//Assigning value for Class variable
		name = "kumar";
		num = 25;
		System.out.println(num);
		System.out.println(name1);
	}
	
	public void classVariable1() {
		name1 = "testing";
		System.out.println(num);
		System.out.println(name);
		System.out.println(data);
	}
	
	public void localVariableTest() {
		//Local variable creation
		int age = 15;
		System.out.println(age);
		
		//Creating local variable with the class variable name
		String name = "java";
		System.out.println(name);
		System.out.println(num);
		System.out.println(name1);
	}
	
	public static void varTest() {
		String n = "123";	
		//Class variable cannot be accessed within the static method
//		System.out.println(name);	
		System.out.println(name1);
	}
	public static void main(String[] args) {
		VariablesTest v = new VariablesTest();
		v.classVariableTest();
		v.classVariable1();
		v.localVariableTest();
		varTest();
		System.out.println(name1);
		//Class variable accessed with the object
		System.out.println(v.name);
	}

}
