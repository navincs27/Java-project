package com.javaconcepts;

public class ArrayTest {
	int[] arr = new int[7];
	public void intArrTest() {
		
		arr[0] = 23;
		arr[3] = 56;
		arr[4] = 34;
		arr[1] = 56;
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("======================");
		//Enhanced for loop or ForEach loop
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("======================");
		
	}
	
	public void stringArrTest() {
		String name[] = new String[5];
		
		
		
		name[0] = "ashiq";
		name[2] = "sadiq";
		name[4] = "navin";
		name[2] = "java";
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("======================");
		
		for(String s : name) {
			System.out.println(s);
		}
		System.out.println("======================");
		
		
		for(int ar : arr) {
			System.out.println(ar);
		}
		
	}
	
	
	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		at.intArrTest();
		at.stringArrTest();
	}

}
