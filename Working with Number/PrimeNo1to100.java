
// Program to Find Prime Number between 1 to 100

import java.lang.*;
public class PrimeNo1to100 {
    public static void main(String[]args){
        System.out.print("Prime Numbers between 1 to 100 are : ");
        for(int i=1;i<=100;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPrime(int num){
        for(int i=2;i<=(num/2);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

/*
Output :
Prime Numbers between 1 to 100 are : 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 */
