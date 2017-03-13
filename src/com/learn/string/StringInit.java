package com.learn.string;

public class StringInit {
	public static void main(String[] args) {
		String str = "I like";
		System.out.println(System.identityHashCode(str));
		str = str + "Java";
		System.out.println(System.identityHashCode(str));
	}
}
