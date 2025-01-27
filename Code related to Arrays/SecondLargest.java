import java.util.*;

public class SecondLargest{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Second Largest Element from the Array is : "+secondLargestElement(size,arr));
        scanner.close();
    }
    public static int secondLargestElement(int n,int arr[]){
        int max=-1;
        int prevMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>=max){
                prevMax=max;
                max=arr[i];
            }else if(arr[i]>=prevMax && max>=arr[i]){
                prevMax=arr[i];
            }
        }
        return prevMax;
    }
}

/*
Output :
Enter the Size : 5
Enter 0 Element : 69
Enter 1 Element : 47
Enter 2 Element : 74
Enter 3 Element : 25
Enter 4 Element : 14
Second Largest Element from the Array is : 69
 */