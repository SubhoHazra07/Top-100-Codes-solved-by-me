// Find the Factors of a Number

import java.lang.*;
import java.util.*;
public class FactorsOfNumbers {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        findFactors(num);
        scanner.close();
    }
    public static void findFactors(int num){
        System.out.print("Factors of Number : ");
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.print(num);
    }
}

/*
Output : 
Enter a Number : 100
Factors of Number : 1 2 4 5 10 20 25 50 100
 */