package com.learn.string;

public class StringSplit {
	public static void main(String[] args) {
		String s = "helloworld";
		String[] s2 = s.split("abc");
		for(int i = 0; i < s2.length; i++){
			System.out.print(s2[i] + " " + i);
		}
	}
}
