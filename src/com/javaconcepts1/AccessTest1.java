package com.javaconcepts1;

import com.javaconcepts.AccessSpecifiersTest;

public class AccessTest1 extends AccessSpecifiersTest{
	
	public static void main(String[] args) {
		AccessSpecifiersTest a = new AccessSpecifiersTest();
		a.getStudentId();
		
		AccessTest1 aa = new AccessTest1();
		aa.getStudentAddress();
		aa.getStudentId();
		
	}

}
