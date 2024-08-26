package com.javaconcepts;

public class SwitchStatement {

	public void switchTest() {
		int errorCode = 401;

		switch (errorCode) {

		case 400:
			System.out.println("Bad Request");
			break;
		case 401:
			System.out.println("Unauthorized");
			break;
		case 404:
			System.out.println("Not Found");
			break;
		case 500:
			System.out.println("Internal Server Error");
			break;
		default:
			System.out.println("Invalid error code");
			break;

		}

//		if (errorCode == 400) {
//			System.out.println("Bad Request");
//		} else if (errorCode == 401) {
//			System.out.println("Unauthorized");
//		} else if (errorCode == 404) {
//			System.out.println("Not Found");
//		} else if (errorCode == 500) {
//			System.out.println("Internal Server Error");
//		} else {
//			System.out.println("Invalid error code");
//		}
	}

	public static void main(String[] args) {
		SwitchStatement s = new SwitchStatement();
		s.switchTest();
	}
}
