// Fibonacci Series upto Nth Term

import java.lang.*;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int n=scanner.nextInt();
        fibonacci(n);
        scanner.close();
    }
    public static void fibonacci(int n){
        int a=0;
        int b=1;
        System.out.print("Fibonacci Series are : "+a+" "+b+" ");
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}

/*
Output :
Enter the Range : 15
Fibonacci Series are : 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
 */
