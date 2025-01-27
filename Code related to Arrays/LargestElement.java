import java.util.*;

public class LargestElement{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Largest Element from the Array is : "+largestElement(size,arr));
        scanner.close();
    }
    public static int largestElement(int n,int arr[]){
        int max=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
}

/*
Output :
Enter the Size : 5
Enter 0 Element : 4
Enter 1 Element : 8
Enter 2 Element : 9
Enter 3 Element : 3
Enter 4 Element : 7
Largest Element from the Array is : 9
 */