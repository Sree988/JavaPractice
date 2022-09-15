package com.java.recursion;

public class fibonacci {
	
//	public static void printFibo(int fibo1, int fibo2, int n, int count) {
//		
//		if (count==0) {
//			System.out.print(fibo1+ " ");
//			count+=1;
//		}if (count==1) {
//			System.out.print(fibo2+ " ");
//			count+=1;
//		}if(count==n) {
//			return;
//		}
//		
//		int fibo3=fibo1+fibo2;
//		System.out.print(fibo3+ " ");
//		printFibo(fibo2,fibo3,n,count+1);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		printFibo(0,1,10,0);
//
//	}
//}
	
	
	
public static void printFibo(int fibo1, int fibo2, int n) {
		
		if(n==2) {
			return;
		}
		
		int fibo3=fibo1+fibo2;
		System.out.print(fibo3+ " ");
		printFibo(fibo2,fibo3,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibo1=0;
		int fibo2=1;
		System.out.print(fibo1+ " ");
		System.out.print(fibo2+ " ");
		printFibo(0,1,10);

	}
}
	
	
	
