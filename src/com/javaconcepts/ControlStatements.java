package com.javaconcepts;

public class ControlStatements extends ConditionalStatements{

	public void forTest() {
		for (int i = 1; i <= 10; i++) {
			if ((i == 5) || (i == 3)) {
				break;
			}
			System.out.print(i);

		}

		for (int i = 1; i <= 10; i++) {
			if ((i == 5) || (i == 7)) {
				continue;
			}
			System.out.print(i);
		}

	}

	public void whileTest() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public void doWhileTest() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

	public static void main(String[] args) {
		ControlStatements c = new ControlStatements();
		c.forTest();
		// c.whileTest();
		
		ControlStatements cc = (ControlStatements) new ConditionalStatements();
		cc.verifyElseIf();
		
	}

}
