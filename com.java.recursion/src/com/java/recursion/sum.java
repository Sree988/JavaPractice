package com.java.recursion;

public class sum {
	public static void addition(int i, int n, int summation) {
		if (i==n) {
			summation+=i;
			System.out.println(summation);
			return;
		}
		summation+=i;
		//System.out.println(summation);
		addition(i+1, n, summation);
	}

	public static void main(String[] args) {
		addition(0, 5, 0);
	}

}
