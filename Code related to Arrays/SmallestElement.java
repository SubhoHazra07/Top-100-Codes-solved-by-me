import java.util.*;

public class SmallestElement{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Smallest Element from the Array is : "+smallestElement(size,arr));
        scanner.close();
    }
    public static int smallestElement(int n,int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }
}

/*
Output :
Enter the Size : 5
Enter 0 Element : 4
Enter 1 Element : 7
Enter 2 Element : 6
Enter 3 Element : 1
Enter 4 Element : 8
Smallest Element from the Array is : 1
 */