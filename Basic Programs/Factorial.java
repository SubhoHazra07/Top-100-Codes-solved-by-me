// Find Factorial of a Number

import java.lang.*;
import java.util.*;
public class Factorial {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        int fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is : "+fact);
        scanner.close();
    }
}

/*
Output : 
Enter a Number : 5
Factorial of 5 is : 120
 */