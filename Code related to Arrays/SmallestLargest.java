import java.util.*;

public class SmallestLargest{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        smallestLargestElement(size,arr);
        scanner.close();
    }
    public static void smallestLargestElement(int n,int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=min){
                min=arr[i];
            }else if(arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element from the Array is : "+max);
        System.out.println("Smallest Element from the Array is : "+min);
    }
}

/*
Output :
Enter the Size : 5
Enter 0 Element : 69
Enter 1 Element : 65
Enter 2 Element : 32
Enter 3 Element : 74
Enter 4 Element : 16
Largest Element from the Array is : 74
Smallest Element from the Array is : 16
 */