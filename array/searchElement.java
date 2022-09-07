import java.util.Scanner;
public class searchElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        
        System.out.println("Enter the number you want to check");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(array[i]==x){
                System.out.println("found at index: "+ i);
            }
        }
    }
}
