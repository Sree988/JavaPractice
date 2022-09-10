package sorting;

import java.util.Scanner;

public class insertionSort {
	static int n;
	public static void sort(int array[]) {
		for (int i=0; i<n;i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements of the array:");
		for (int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		
		//BubbleSort (ascending)
		for (int i=0; i<n-1; i++) {
			int current=array[i];
			int j=i-1;
			while(j<=0 && current<array[j]) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=current;
		}
		sort(array);
		
	}
}

