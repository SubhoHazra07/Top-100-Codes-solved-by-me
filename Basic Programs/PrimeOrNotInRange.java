// Check Prime Numbers within a Given Range

import java.lang.*;
import java.util.*;
public class PrimeOrNotInRange {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Lower Limit : ");
        int lower=scanner.nextInt();
        System.out.print("Enter Upper Limit : ");
        int upper=scanner.nextInt();
        for(int i=lower;i<=upper;i++){
            if(checkPrime(i)){
                System.out.println(i+" is a Prime Number");
            }
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
Enter Lower Limit : 1
Enter Upper Limit : 10
1 is a Prime Number
2 is a Prime Number
3 is a Prime Number
5 is a Prime Number
7 is a Prime Number
 */
