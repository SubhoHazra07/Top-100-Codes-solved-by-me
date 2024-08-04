// Check Whether the Number is Perfect or Not
// Sum of all Factors is the Number itself like 
// Factors of 6 = 1,2,3 and 6=1+2+3

import java.lang.*;
import java.util.*;
public class PerfectNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(checkPerfect(num)){
            System.out.println(num+" is a Perfect Number");
        }else{
            System.out.println(num+" is not a Perfect Number");
        }
        scanner.close();
    }
    public static boolean checkPerfect(int n){
        int sum=0;
        for(int i=1;i<=(n/2);i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
}

/*
Output :
Enter a Number : 28
28 is a Perfect Number
Enter a Number : 9
9 is not a Perfect Number
 */
