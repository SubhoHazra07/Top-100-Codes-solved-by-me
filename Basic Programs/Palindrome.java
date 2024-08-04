// Check Whether the Number is Palindrome or Not

import java.lang.*;
import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        palindrome(num);
        scanner.close();
    }
    public static void palindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(temp==rev){
            System.out.println(temp+" is a Palindrome Number");
        }else{
            System.out.println(temp+" is not a Palindrome Number");
        }
    }
}

/*
Output :
Enter a Number : 121
121 is a Palindrome Number
Enter a Number : 123
123 is not a Palindrome Number
 */