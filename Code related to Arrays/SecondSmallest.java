import java.util.*;

public class SecondSmallest{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Second Smallest Element from the Array is : "+secondSmallestElement(size,arr));
        scanner.close();
    }
    public static int secondSmallestElement(int n,int arr[]){
        int min=Integer.MAX_VALUE;
        int prevMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=min){
                prevMin=min;
                min=arr[i];
            }else if(arr[i]<=prevMin && min<=arr[i]){
                prevMin=arr[i];
            }
        }
        return prevMin;
    }
}

/*
Output :
Enter the Size : 5
Enter 0 Element : 74
Enter 1 Element : 65
Enter 2 Element : 48
Enter 3 Element : 97
Enter 4 Element : 32
Second Smallest Element from the Array is : 48
 */