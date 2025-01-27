import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByOrder {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Array Size : ");
        int size1=scanner.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter 1st Array Elements !");
        for(int i=0;i<size1;i++){
            System.out.print("Enter "+i+" Element : ");
            arr1[i]=scanner.nextInt();
        }
        System.out.print("Enter Second Array Size : ");
        int size2=scanner.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter 2nd Array Elements !");
        for(int i=0;i<size2;i++){
            System.out.print("Enter "+i+" Element : ");
            arr2[i]=scanner.nextInt();
        }
        sortArray(arr1,arr2);
        scanner.close();
    }
    public static void sortArray(int arr1[],int arr2[]){
        boolean visited[]=new boolean[arr1.length];
        Arrays.fill(visited,false);
        System.out.print("Sorted Array are : ");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    System.out.print(arr1[j]+" ");
                    visited[j]=true;
                }
            }
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false){
                System.out.print(arr1[i]+" ");
            }
        }
    }
}

/*
Output : 
Enter First Array Size : 9
Enter 1st Array Elements !
Enter 0 Element : 1
Enter 1 Element : 2
Enter 2 Element : 3
Enter 3 Element : 4
Enter 4 Element : 3
Enter 5 Element : 2
Enter 6 Element : 4
Enter 7 Element : 2
Enter 8 Element : 5
Enter Second Array Size : 4
Enter 2nd Array Elements !
Enter 0 Element : 4
Enter 1 Element : 2
Enter 2 Element : 1
Enter 3 Element : 3
Sorted Array are : 4 4 2 2 2 1 3 3 5
 */