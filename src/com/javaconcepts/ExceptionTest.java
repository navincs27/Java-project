package com.javaconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	
	String s = "";
	
	public void compileTimeExceptionTest() throws Exception  {
		File f = new File("C:\\Users\\User\\Desktop\\Self Intro.docx");
		FileInputStream fis = new FileInputStream(f);
		
		Thread.sleep(5000);
		
		System.out.println("exception");
	}
	
	public void runTimeException() {
		try {
			System.out.println(s.charAt(3));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		int a = 10;
		int b = 2;
		try {
			System.out.println(a/b);
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("qweqwrwe");
		
		String s = ".200";
		System.out.println(Integer.parseInt(s));
		
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		ExceptionTest e = new ExceptionTest();
//		e.compileTimeExceptionTest();
		e.runTimeException();
	}

}
