// Fibonacci Series upto Nth Term using Recursion

import java.lang.*;
import java.util.*;
public class FibonacciSeriesRecursion {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int n=scanner.nextInt();
        int a=0,b=1;
        System.out.print("Fibonacci Series are : "+a+" "+b+" ");
        fibonacci(a,b,n-2);
        scanner.close();
    }
    public static void fibonacci(int a,int b,int n){
        if(n==0){
            return; // Base Case
        }
        int c=a+b;
        System.out.print(c+" ");
        fibonacci(b,c,n-1); // Function call itself
    }
}

/*
Output : 
Enter the Range : 5
Fibonacci Series are : 0 1 1 2 3 
 */
