import java.util.Scanner;
public class twoDimentionalArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int array[][]=new int[row][col];
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j]=sc.nextInt();
            }
        }

        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }

        int x=sc.nextInt();
        if(array[i][j]==x){
            System.out.println();
        }
    }
}
