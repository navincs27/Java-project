package com.javaconcepts;

public class ConditionalStatements1 {

	public void verifyNestedIf() {
		int age = 23;
		if ((age >= 1) && (age <= 100)) {
			if ((age >= 6)) {
				if (age >= 18) {
					if (age >= 60) {
						System.out.println("Senior citizen");
					} else {
						System.out.println("Major");
					}
				} else {
					System.out.println("Minor");
				}
			} else {
				System.out.println("Child");
			}
		} else {
			System.out.println("Invalid Age");
		}
	}

}
