import java.util.*;

public class IncreaseDecreaseArray{
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
        System.out.print("After Manupulating the Array : ");
        for(int i=0;i<size;i++){
            System.out.print(result[i]+" ");
        }
        scanner.close();
    }
    public static int[] reverseArray(int n,int arr[]){
        for(int i=0;i<(n/2);i++){
            for(int j=0;j<(n/2)-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=n/2;i<n-1;i++){
            for(int j=n/2;j<n-1-(i-n/2);j++){
                if(arr[j]<arr[j+1]){
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
Enter the Size : 8
Enter 0 Element : 5
Enter 1 Element : 7
Enter 2 Element : 5
Enter 3 Element : 3
Enter 4 Element : 4
Enter 5 Element : 7
Enter 6 Element : 6
Enter 7 Element : 1
After Manupulating the Array : 3 5 5 7 7 6 4 1
 */