package com.java.recursion;

public class factorial {
	public static void printFactorial(int i, int n, int fact) {
		if(i==n-1) {
			System.out.println(fact);
			return;
		}
		fact=fact*(n-i);
		printFactorial(i+1, n, fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFactorial(0, 5, 1);

	}

}
