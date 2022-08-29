import java.util.Scanner;
public class InputOutput {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of array element");
		int n=sc.nextInt();
		int[] marks=new int[n];
		
		for (int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
			for (int i=0;i<n;i++) {
				System.out.print(marks[i]);
	}
	}
    
}
