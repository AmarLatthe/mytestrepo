package com.xworkz.pharmacy.dto;

public class Test {

	static int number = 1000;
	public static void main(String[] args) {
		System.out.println(incr());
		System.out.println(incr());
		System.out.println(incr());
		System.out.println(incr());
		System.out.println(incr());
		
	}
	
	public static StringBuilder incr() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<1000; i++) {
			return sb.append(Integer.toString(i));
		}
		return null;
		
	}
}
