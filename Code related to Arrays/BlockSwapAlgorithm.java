import java.util.*;
public class BlockSwapAlgorithm
{
    public static void leftRotate(int arr[],int d,int n)
    {
        leftRotateRec(arr,0,d,n);
    }
    public static void leftRotateRec(int arr[],int i,int d,int n)
    {
        if(d==0||d==n)
            return;
        if(n-d==d)
        {
            swap(arr,i,n-d+i,d);
            return;
        }
        if(d<n-d)
        {
            swap(arr,i,n-d+i,d);
            leftRotateRec(arr,i,d,n-d);
        }
        else
        {
            swap(arr,i,d,n-d);
            leftRotateRec(arr,n-d+i,2*d-n,d);
        }
    }
    public static void printArray(int arr[],int size,int index)
    {
        int i;
        System.out.print("After Rotation the Array by Position "+index+" is : ");
        for(i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void swap(int arr[],int fi,int si,int d)
    {
        int i, temp;
        for(i=0;i<d;i++)
        {
            temp=arr[fi+i];
            arr[fi+i]=arr[si+i];
            arr[si+i]=temp;
        }
    }
    public static void main(String[] args)
    {
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
        leftRotate(arr,d,size);
        printArray(arr,size,d);
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
Enter Number of Position to Rotate the Array : 2
After Rotation the Array by Position 2 is : 3 4 5 6 7 1 2
 */
