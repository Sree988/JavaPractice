package com.java.string;

public class reverseString {
	public void recursivemethod(String str, int idx) {
		if (str.length()==1) {
			return;
		}
		for(int i=0; i<str.length();i--) {
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		
	}

}
