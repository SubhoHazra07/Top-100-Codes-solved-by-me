import java.util.*;

public class ReverseAnArray{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        int result[]=reverseArray(size,arr);
        System.out.print("After Reversing the Array : ");
        for(int i=0;i<size;i++){
            System.out.print(result[i]+" ");
        }
        scanner.close();
    }
    public static int[] reverseArray(int n,int arr[]){
        for(int i=0;i<(n/2);i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
}

/*
Output :
Enter the Size : 5
Enter 0 Element : 5
Enter 1 Element : 6
Enter 2 Element : 8
Enter 3 Element : 7
Enter 4 Element : 1
After Reversing the Array : 1 7 8 6 5
 */