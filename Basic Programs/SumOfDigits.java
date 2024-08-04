// Find Sum of Digits

import java.lang.*;
import java.util.*;
public class SumOfDigits {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        System.out.println("Sum of Digits : "+sumOfDigits(num));
        scanner.close();
    }
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}

/*
Output : 
Enter a Number : 56879
Sum of Digits : 35
 */
