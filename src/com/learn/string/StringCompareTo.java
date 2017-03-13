package com.learn.string;

public class StringCompareTo {
	public static void main(String[] args) {
		String s = "Hello";
		String s2 = "He";
		String s3 = "Helpo";
		
		int a = s.compareTo(s2);
		System.out.println("a : " + a);
		int b = s.compareTo(s3);
		System.out.println("b : " + b);
		int c = s2.compareTo(s3);
		System.out.println("c : " + c);
	}
}
