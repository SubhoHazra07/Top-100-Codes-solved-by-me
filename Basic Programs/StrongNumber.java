// Check Whether or Not the Given Number is a Strong Number
// 145 = 1!+4!+5!

import java.lang.*;
import java.util.*;
public class StrongNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(checkStrong(num)){
            System.out.println(num+" is a Strong Number");
        }else{
            System.out.println(num+" is not a Strong Number");
        }
        scanner.close();
    }
    public static boolean checkStrong(int num){
        int temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=factorial(rem);
            num/=10;
        }
        return temp==sum;
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }
}

/*
Output:
Enter a Number : 145
145 is a Strong Number
Enter a Number : 6523
6523 is not a Strong Number
 */