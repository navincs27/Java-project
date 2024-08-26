package com.javaconcepts;

public class DataTypesTest {
	
	public void primitiveTest() {
		byte age = 25;
		short salary = 30000;
		int ctc = 500000;
		long phone = 9876543210L;
		float percentage = 27.678F;
		double interest = 34345.35634623423;
		char initial = '5';
		boolean condition = true;
		
		String name = "navin";
		
		
		System.out.println("The age is : "+ age+salary);
		
		System.out.println("Age is : "+age+", Salary is : " + salary+", Initial is : "+initial);
		
		System.out.println(name+ctc+salary);
		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		DataTypesTest d = new DataTypesTest();
		d.primitiveTest();
	}

}
