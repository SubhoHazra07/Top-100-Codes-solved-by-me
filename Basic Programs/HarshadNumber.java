// Check Whether the Number is Harshad Number or Not
// A Harshad Number is a number that is divisible by the sum of its digits like
// 21/(2+1)=7, 153/(1+5+3)=17

import java.lang.*;
import java.util.*;
public class HarshadNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(checkHarshad(num)){
            System.out.println(num+" is a Harshad Number");
        }else{
            System.out.println(num+" is not a Harshad Number");
        }
        scanner.close();
    }
    public static boolean checkHarshad(int num){
        int sum=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return temp%sum==0;
    }
}

/*
Output : 
Enter a Number : 153
153 is a Harshad Number
Enter a Number : 65
65 is not a Harshad Number
 */
