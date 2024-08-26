package com.javaconcepts;

public class SwitchTest {
	
	public void verifyErrorCode() {
		int errorCode = 405;
		
		switch(errorCode) {
		
		case 400:
			System.out.println("Bad request");
			break;
			
		case 401:
			System.out.println("Unauthorized");
			break;
			
		case 403:
			System.out.println("Forbidden");
			break;
			
		case 404:
			System.out.println("Not found");
			break;
			
			default:
				System.out.println("Invalid error code");
		}
	}
	
	public static void main(String[] args) {
		SwitchTest s = new SwitchTest();
		s.verifyErrorCode();
	}

}
