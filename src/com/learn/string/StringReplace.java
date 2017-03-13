package com.learn.string;

public class StringReplace {
	public static void main(String[] args) {
		String s = "hello world";
		String s1 = s.replace("l", "d");
		System.out.println(s1);
		
		String s2 = "a78e5opx567";
		String s3 = s2.replaceAll("[0-9]", "");
		System.out.println(s3);
	}
}
