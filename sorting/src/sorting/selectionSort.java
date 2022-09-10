package sorting;

import java.util.Scanner;

public class selectionSort {
	static int n;
	public static void sort(int array[]) {
		for (int i=0; i<n;i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int array[]=new int[n];
		for (int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		for (int i=0;i<n-1;i++) {
			int smallest=i;
			for (int j=i+1;j<n;j++) {
				if (array[smallest]>array[j]) {
					smallest=j;
				}
				int temp=array[smallest];
				array[smallest]=array[i];
				array[i]=temp;
			}
		}
		sort(array);
	}
	
}
