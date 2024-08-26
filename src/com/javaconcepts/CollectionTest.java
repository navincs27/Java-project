package com.javaconcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {
	
	public void testArrayList() {
		List<Integer> arr = new LinkedList<>();
		arr.add(23);
		arr.add(23);
		arr.add(33);
		arr.add(63);
		arr.add(235);
		arr.add(233);
		arr.add(13);
		
		System.out.println(arr);
		int size = arr.size();
		System.out.println(size);
		Integer integer = arr.get(5);
		System.out.println(integer);
		Integer remove = arr.remove(2);
		System.out.println(remove);
		System.out.println(arr);
		boolean contains = arr.contains(23);
		System.out.println(contains);
		int indexOf = arr.indexOf(23);
		System.out.println(indexOf);
		System.out.println("==============================");
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("==============================");
		for(Integer a : arr) {
			System.out.println(a);
		}
		System.out.println("==============================");
		
		Iterator<Integer> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==============================");
		
		ListIterator<Integer> listIterator = arr.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("==============================");
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
	}
	
	public void hashSetTest() {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(null);
		set.add(433);
		set.add(23);
		set.add(3233);
		set.add(633);
		set.add(25);
		set.add(2433);
		set.add(13);
		set.add(null);
		
		System.out.println(set.size());
		System.out.println(set);
		
		
		List<Integer> arr = new LinkedList<>();
		arr.add(23);
		arr.add(23);
		arr.add(33);
		arr.add(63);
		arr.add(235);
		arr.add(233);
		arr.add(13);
		
		
//		set.addAll(arr);
//		System.out.println(arr);
//		System.out.println(set);
		
		System.out.println("==============================");
		
//		arr.retainAll(set);
//		System.out.println(arr);
//		System.out.println(set);
	

		System.out.println(arr);
		System.out.println(set);

		set.removeAll(arr);
		System.out.println(arr);
		System.out.println(set);
	
	}
	
	public void mapTest() {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Cs001", 345);
		map.put("Cs004", 343);
		map.put("Cs003", 365);
		map.put("Cs004", 347);
		map.put("Cs006", 341);
		map.put("Cs002", 323);
		map.put("Cs001", 376);
		
		System.out.println(map.size());
		System.out.println(map);
		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(map);
		System.out.println(entrySet);
	}
	
	
	
	
	public static void main(String[] args) {
		CollectionTest c = new CollectionTest();
//		c.testArrayList();
//		c.hashSetTest();
		c.mapTest();
	}

}
