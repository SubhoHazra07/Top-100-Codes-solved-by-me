// Find Reverse of a Number

import java.lang.*;
import java.util.*;
public class ReverseOfNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        System.out.println("Reverse of "+num+" is : "+reverse(num));
        scanner.close();
    }
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
}

/*
Output : 
Enter a Number : 123
Reverse of 123 is : 321
 */
