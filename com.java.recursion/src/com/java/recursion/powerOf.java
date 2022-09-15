package com.java.recursion;

public class powerOf {
	
	//n^x
	public static void printValue(int n,int n1, int x) {
		if(x==0) {
			System.out.println(n1);
			return;
			
		}
		n1=n1*n;
		printValue(n,n1, x-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printValue(5, 1, 2);
	}

}
