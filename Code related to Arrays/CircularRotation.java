import java.util.*;
public class CircularRotation{
    public static void circularRotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[]){
        System.out.print("After Applying Circular Rotation to the Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Enter Number of Position to Rotate the Array : ");
        int d=scanner.nextInt();
        circularRotate(arr,d);
        printArray(arr);
        scanner.close();
    }
}

/*
Output : 
Enter the Size : 7
Enter 0 Element : 1
Enter 1 Element : 2 
Enter 2 Element : 3
Enter 3 Element : 4
Enter 4 Element : 5
Enter 5 Element : 6
Enter 6 Element : 7
Enter Number of Position to Rotate the Array : 3
After Applying Circular Rotation to the Array : 5 6 7 1 2 3 4
 */