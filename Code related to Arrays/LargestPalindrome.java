import java.util.*;

public class LargestPalindrome{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Largest Palindrome Element of the array is : "+largestPalindrome(size,arr));
        scanner.close();
    }
    public static int largestPalindrome(int n,int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(palindrome(arr[i]) && arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
    public static boolean palindrome(int num){
        int temp=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(temp==rev){
            return true;
        }
        return false;
    }
}

/*
Output :
Enter the Size : 4
Enter 0 Element : 121
Enter 1 Element : 2322
Enter 2 Element : 54545
Enter 3 Element : 999990
Largest Palindrome Element of the array is : 54545
 */