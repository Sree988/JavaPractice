package sorting;

import java.util.Scanner;

public class bubbleSort {
	static int n;
	public static void sortArray(int array[]) {
		System.out.println("Sorted Array:");
		for (int i=0; i<n; i++) {
			System.out.print(+array[i]+" ");
			}
	}
	public static void main(String args[]) {
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
			for (int j=0; j<n-i-1; j++) {
				if (array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		sortArray(array);
		
	}

}
