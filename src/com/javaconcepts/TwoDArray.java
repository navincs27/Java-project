package com.javaconcepts;

public class TwoDArray {
	
	public void twoDArrayTest() {
		int[][] arr = new int[5][3];

		arr[0][0] = 34;
		arr[0][2] = 45;
		arr[1][0] = 34;
		
		System.out.println(arr[4][2]);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(i+" " +j+" "+arr[i][j]);
			}
		}
			
		for(int[] a : arr) {
			for(int ar: a) {
				System.out.println(ar);
			}
		}
	}
	
	public static void main(String[] args) {
		TwoDArray t = new TwoDArray();
		t.twoDArrayTest();
	}

}
