// Find Factorial of a Number by using Recursion

import java.lang.*;
import java.util.*;
public class FactorialByRecursion {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        System.out.println("Factorial of "+num+" is : "+factorial(num));
        scanner.close();
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
}

/*
Output :
Enter a Number : 6
Factorial of 6 is : 720
 */
