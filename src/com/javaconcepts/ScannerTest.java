package com.javaconcepts;

import java.util.Scanner;

public class ScannerTest {
	Scanner sc = new Scanner(System.in);
	public void primitiveTest() {
		
		System.out.println("Enter int value");
		int a = sc.nextInt();
		
		System.out.println("Entered input value is : "+a);
	}
	
	public void charTest() {
		System.out.println("Enter char value");
		char c = sc.next().charAt(0);
		
		System.out.println("Entered char is : "+c);
	}
	
	public void strTest() {
		System.out.println("Enter String value");
		String str = sc.next();
		
		System.out.println("Entered String is : "+str);
	}
	
	public void str1Test() {
		System.out.println("Enter String value");
		String str = sc.nextLine();
		
		System.out.println("Entered String1 is : "+str);
	}
	
	
	public static void main(String[] args) {
		ScannerTest s = new ScannerTest();
		
		s.primitiveTest();
		s.charTest();
		s.strTest();
		s.str1Test();
	}

}
