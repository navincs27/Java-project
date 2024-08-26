package com.javaconcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prom {
	
	public static void main(String[] args) {
		
		
		int arr[] = {23,34,43,34,34,2,3,45,45,67,23};
		int index = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					map.put(i, arr[i]);
				}
			}
		}
		System.out.println(map);
		
	}

}
