// Find Prime Factors of a Number

import java.lang.*;
import java.util.*;
public class PrimeFactors {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        primeFactors(num);
        scanner.close();
    }
    public static void primeFactors(int num){
        System.out.print("Prime Factors are : ");
        while(num%2==0){
            System.out.print(2+" "); // Print Number od 2's
            num/=2;
        }
        for(int i=3;i<=Math.sqrt(num);i+=2){  // Increment by 2 because it is for Odd Numbers
            while(num%i==0){
                System.out.print(i+" ");
                num/=i;
            }
        }
        if(num>2){
            System.out.print(num); // When n is Prime Number greater than 2
        }
    }
}

/*
Output :
Enter a Number : 315
Prime Factors are : 3 3 5 7
 */
