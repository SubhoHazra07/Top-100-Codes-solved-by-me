import java.util.*;
public class SymmetricPairs{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Row Size : ");
        int row=scanner.nextInt();
        int arr[][]=new int[row][2];
        for(int i=0;i<row;i++){
            for(int j=0;j<2;j++){
                System.out.print("Enter Element ["+i+"]["+j+"] : ");
                arr[i][j]=scanner.nextInt();
            }
        }
        symmetricPairs(row,arr);
        scanner.close();
    }
    public static void symmetricPairs(int row,int arr[][]){
        System.out.println("Symmetric Pairs are : ");
        for(int i=0;i<row;i++){
            for(int j=i+1;j<row;j++){
                if(arr[i][0]==arr[j][1]&&arr[i][1]==arr[j][0]){
                 System.out.print("("+arr[i][0]+","+arr[i][1]+") ");
                }
            }
        }
    }
}

/*
Enter Row Size : 5
Enter Element [0][0] : 10
Enter Element [0][1] : 20
Enter Element [1][0] : 20
Enter Element [1][1] : 30
Enter Element [2][0] : 30
Enter Element [2][1] : 20
Enter Element [3][0] : 40
Enter Element [3][1] : 30
Enter Element [4][0] : 50
Enter Element [4][1] : 40
Symmetric Pairs are : 
(20,30)
*/