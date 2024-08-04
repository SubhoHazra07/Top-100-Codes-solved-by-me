// Check Whether the Number is Prime or Not

import java.lang.*;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(checkPrime(num)){
            System.out.println(num+" is a Prime Number");
        }else{
            System.out.println(num+" is not a Prime Number");
        }
        scanner.close();
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

/*
Output :
Enter a Number : 23
23 is a Prime Number

Enter a Number : 15
15 is not a Prime Number
 */
