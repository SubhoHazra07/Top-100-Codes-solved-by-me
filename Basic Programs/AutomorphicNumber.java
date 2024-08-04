// Check whether the Number is Automorphic No or not
// 5^2=25 , 25^2=625

import java.lang.*;
import java.util.*;
public class AutomorphicNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(checkAutomorphic(num)){
            System.out.println(num+" is an Automorphic Number");
        }else{
            System.out.println(num+" is not an Automorphic Number");
        }
        scanner.close();
    }
    public static boolean checkAutomorphic(int num){
        int n=Math.abs(num);
        int square=n*n;
        while(n>0){
            if(n%10!=square%10){
                return false;
            }
            n/=10;
            square/=10;
        }
        return true;
    }
}

/*
Output :
Enter a Number : 625
625 is an Automorphic Number
Enter a Number : 49 
49 is not an Automorphic Number
 */
