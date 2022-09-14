package com.java.recursion;

public class increaseNumbers {

//	public static void increaseNumb(int n) {
//		if (n==6) {
//			return;
//		}
//		System.out.println(n);
//		increaseNumb(n+1);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n=1;
//		increaseNumb(n);
//
//	}
	
	public static void increaseNumb(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n);
		increaseNumb(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		increaseNumb(n);

	}

}
