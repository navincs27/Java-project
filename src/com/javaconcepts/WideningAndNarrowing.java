package com.javaconcepts;

public class WideningAndNarrowing {
	
	public void narrowing() {
		long l = 23;
		int a = 128;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(b);
		int x = (int)l;
	}
	
	public void widening() {
		short s = 3465;
		int a = s;
		long l = a;
		System.out.println(s);
		System.out.println(a);
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		WideningAndNarrowing w = new WideningAndNarrowing();
		w.widening();
		w.narrowing();
	}

}
