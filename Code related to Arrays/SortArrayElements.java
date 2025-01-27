import java.util.*;

public class SortArrayElements{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        int result[]=sortArray(size,arr);
        System.out.print("After Sorting the Array : ");
        for(int i=0;i<size;i++){
            System.out.print(result[i]+" ");
        }
        scanner.close();
    }
    public static int[] sortArray(int n,int arr[]){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        return arr;
    }
}

/*
Output :
Enter the Size : 5
Enter 0 Element : 2
Enter 1 Element : 1
Enter 2 Element : 7
Enter 3 Element : 5
Enter 4 Element : 4
After Sorting the Array : 1 2 4 5 7
 */