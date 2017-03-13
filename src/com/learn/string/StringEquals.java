package com.learn.string;

public class StringEquals {
	public static void main(String[] args) {
		String s = "Hello World";
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		String s3 = new String("Hello");
		String s4 = "Hello World";
		
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("------------------------");
		System.out.println(s == s1);
		System.out.println(s == s3);
		System.out.println(s == s4);
	}
}
